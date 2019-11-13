package com.profesys.scientiam.crm.contact

import java.util.Date;

import com.profesys.scientiam.security.User;

class TelecomNumber {

 
	ContactMech contactMech
	String countryCode
	String areaCode
	String contactNumber
	String askForName
		//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
 

	static constraints = {
		 
		contactMech maxSize: 36, unique: true
		countryCode nullable: true, maxSize: 10
		areaCode nullable: true, maxSize: 10
		contactNumber nullable: true, maxSize: 60
		askForName nullable: true, maxSize: 100
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
