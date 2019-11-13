package com.profesys.scientiam.configuration

import java.util.Date;

import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.security.User;

class TaxonomyHeader {

	/*
	 * Estas son las taxonomias por nombre, que vamos a disponer en la empresa
	 * para relacionar cada empresa que utilicemos en el sistema 
	 * 
	 * 
	 */
 
	String          description
	//DataType           dataType 
	//dataLength         dataLength

	//Seguridad & Auditoria
	Integer               state   // 0-Borrado 1-ok  2-modificado
	User  	        userCreated
	User  	        userUpdated
	Date            dateCreated  //Date  fechaalta
	Date            lastUpdated  //Date  fechaactualizacion
	Date            dateDeleted
	
	static constraints = {
		 
		description(nullable: false , display:true )
		
		
			  state(nullable: true , display:false )
		userCreated(nullable: true , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: true , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}
	
	String toString(){
		return "${id}- ${description}"
		}
	
}
