package com.profesys.scientiam.crm.contact

import java.util.Date;

import com.profesys.scientiam.security.User;

class ContactMechPurposeType {

	String id
	String description
	 

	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	

	static mapping = {
		id column: "contact_mech_purpose_type_id", generator: "assigned"
		version false
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
		 
	}
}
