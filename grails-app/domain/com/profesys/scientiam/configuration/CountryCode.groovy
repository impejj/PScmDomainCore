package com.profesys.scientiam.configuration

import java.util.Date;

import com.profesys.scientiam.security.User;

class CountryCode {

	String id
	String countryAbbr
	String countryNumber
	String countryName

	//Seguridad & Auditoria
	Integer               state   // 0-Borrado 1-ok  2-modificado
	User  	        userCreated
	User  	        userUpdated
	Date            dateCreated  //Date  fechaalta
	Date            lastUpdated  //Date  fechaactualizacion
	Date            dateDeleted

	static mapping = {
		id column: "country_code", generator: "assigned"
		version true
	}

	static constraints = {
				 id maxSize: 36
		countryAbbr nullable: true, maxSize: 60
		countryNumber nullable: true, maxSize: 60
		countryName nullable: true
		 
			  state nullable: false , display:false 
		userCreated nullable: false , display:false 
		userUpdated nullable: true , display:false 
		dateCreated nullable: false , display:false 
		lastUpdated nullable: true , display:false 
		dateDeleted nullable: true , display:false 
	}
}
