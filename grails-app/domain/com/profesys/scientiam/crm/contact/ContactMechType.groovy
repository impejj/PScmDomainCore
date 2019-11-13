package com.profesys.scientiam.crm.contact

import java.util.Date;

import com.profesys.scientiam.security.User;

class ContactMechType {

	String id
	Character hasTable
	String description
	 
	ContactMechType parentType
	//Seguridad & Auditoria
	Integer         state   // 0-Borrado 1-ok  2-modificado
	User  	  userCreated
	User  	  userUpdated
	Date      dateCreated  //Date  fechaalta
	Date      lastUpdated  //Date  fechaactualizacion
	Date      dateDeleted
	 

	static mapping = {
		id column: "contact_mech_type_id", generator: "assigned"
		version false
	}

	static constraints = {
		id maxSize: 36
		parentType maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
