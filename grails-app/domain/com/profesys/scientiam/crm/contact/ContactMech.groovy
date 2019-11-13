package com.profesys.scientiam.crm.contact

import java.util.Date;

import com.profesys.scientiam.security.User;

class ContactMech {

	 String id
	String infoString
	 
 	TelecomNumber telecomNumber
 	PostalAddress postalAddress
	ContactMechType parentType
	
	
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	 
	static belongsTo = [ContactMechType]

 
//
	static mapping = {
		id column: "contact_mech_id", generator: "assigned"
		version true
	}

	static constraints = {
		infoString nullable: true
		 
 		telecomNumber nullable: true, maxSize: 36, unique: true
 		postalAddress nullable: true, maxSize: 36, unique: true
	}
}
