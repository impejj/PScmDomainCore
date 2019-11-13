package com.profesys.scientiam.configuration

import java.util.Date;

import com.profesys.scientiam.security.User;

class Prefix {

	/*
	 *Detalle de los prefijos que vamos a utilizar para todos los nombres de documentos
	 *nombres de cada instancia de los diferentes modulos, etc...
	 * 
	 */
	 
	String shortName
	String name
	String description
	String detail 
	 

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	static constraints = {
				  
		  shortName(nullable: false , display:true , maxSize: 36)
		       name(nullable: false , display:true , maxSize: 240)
   	    description(nullable: false , display:true , maxSize: 240)
 		     detail(nullable: false , display:true , size:0..65535)
		
			  state(nullable: true , display:false )
		userCreated(nullable: true , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: true , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}
	
	static mapping = {
		table 'prefix'
			detail type: 'text'
		 }
		 
		 
	String toString(){
		return "${id}- ${description}"
		}
}
