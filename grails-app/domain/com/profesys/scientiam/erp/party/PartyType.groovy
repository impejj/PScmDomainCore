package com.profesys.scientiam.erp.party

import java.util.Date

import com.profesys.scientiam.security.User

class PartyType {

	   String   id
	Character   hasTable
	   String   description
	PartyType   parentType
 
	  //Seguridad & Auditoria
	  Integer   state         // 0-Borrado 1-ok  2-modificado
	     User   userCreated
	     User  	userUpdated
	     Date   dateCreated  //Date  fechaalta
	     Date   lastUpdated  //Date  fechaactualizacion
	     Date   dateDeleted
	
		 static belongsTo = [   parentType: PartyType ]
		 
		  //static mappedBy = [   parentType: "none" ]
		  
	static mapping = {
		id column: "party_type_id", generator: "assigned"
		version true
		parentType cascade: 'all'
	}

	static constraints = {
		         id   maxSize: 36
		 parentType   maxSize: 36
	 
		description   nullable: true
		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: false
		dateCreated   nullable: false
		lastUpdated   nullable: false
		dateDeleted   nullable: true
	}
	String toString(){
		return "${description}"
		}
	
}
