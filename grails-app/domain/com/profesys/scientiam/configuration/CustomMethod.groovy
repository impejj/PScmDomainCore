package com.profesys.scientiam.configuration

import java.util.Date;

import com.profesys.scientiam.security.User;

class CustomMethod {

    String id
	String customMethodName
	String description
 
	CustomMethodType customMethodType
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
 
	static mapping = {
		id column: "custom_method_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		customMethodName nullable: true
		description nullable: true
		state(nullable: true , display:false )
		userCreated(nullable: true , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: true , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}
}
