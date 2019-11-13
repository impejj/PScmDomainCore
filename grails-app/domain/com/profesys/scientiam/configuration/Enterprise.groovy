package com.profesys.scientiam.configuration

import java.util.Date;

import com.profesys.scientiam.security.User;

class Enterprise {

	//Tabla con las empresas que administramos en el sistema
	 
	String          cuit
	String     shortName
	String          name
	String   description
	 

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	static constraints = {
			   cuit(nullable: false , display:true )
				  
		  shortName(nullable: false , display:true , maxSize: 36)
			   name(nullable: false , display:true , maxSize: 240)
		   description(nullable: false , display:true , maxSize: 240)
			  
					      state nullable: false , display:false 
		userCreated nullable: false , display:false 
		userUpdated nullable: true , display:false 
		dateCreated nullable: false , display:false 
		lastUpdated nullable: true , display:false 
		dateDeleted nullable: true , display:false 
	}
	
	static mapping = {
		table 'enterprise'
		
		 
		 
	}
	String toString(){
		return "${id}- ${description}"
		}
}
