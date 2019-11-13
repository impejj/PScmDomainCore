package com.profesys.scientiam.resource

import java.util.Date;

import com.profesys.scientiam.security.User;

class ReferenceGroup {

	   String   id
	Character   hasTable
	   String   description
	ReferenceGroup   parentType
 
	  //Seguridad & Auditoria
	  	 Integer   			state         // 0-Borrado 1-ok  2-modificado
	     User   	userCreated
	     User  			userUpdated
	     Date   		dateCreated  //Date  fechaalta
	     Date   		lastUpdated  //Date  fechaactualizacion
	     Date   		dateDeleted
	
		 static belongsTo = [   parentType: ReferenceGroup ]
		 
		  static mappedBy = [   parentType: "none" ]
		  
	static mapping = {
		id column: "reference_group_id", generator: "assigned"
		version true
		parentType cascade: 'all'
	}

	static constraints = {
		         id   maxSize: 36
		 parentType   maxSize: 36
	 
		description   nullable: true
		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: true
		dateCreated   nullable: false
		lastUpdated   nullable: true
		dateDeleted   nullable: true
	}
	String toString(){
		return "${id}- ${description}"
		}
	
}
