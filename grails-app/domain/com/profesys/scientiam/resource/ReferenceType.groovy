package com.profesys.scientiam.resource

import java.util.Date;

import com.profesys.scientiam.security.User;

class ReferenceType {

	   String   	id
	Character   	hasTable
	   String   	description

	ReferenceType   parentType
	String          fontImage
	  //Seguridad & Auditoria
	  Integer   state         // 0-Borrado 1-ok  2-modificado
	     User   userCreated
	     User  	userUpdated
	     Date   dateCreated  //Date  fechaalta
	     Date   lastUpdated  //Date  fechaactualizacion
	     Date   dateDeleted
	

		  
	static mapping = {
		id column: "reference_type_id", generator: "assigned"
		version true

	}

	static constraints = {
		         id   maxSize: 36
		 parentType   maxSize: 36
		fontImage    nullable: true , display:true

		description   nullable: true
		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: true
		dateCreated   nullable: false
		lastUpdated   nullable: true
		dateDeleted   nullable: true
	}
	String toString(){
		return "${description}"
		}
	
}
