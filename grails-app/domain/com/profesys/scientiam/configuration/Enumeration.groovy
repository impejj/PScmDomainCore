package com.profesys.scientiam.configuration

import java.util.Date;

import com.profesys.scientiam.security.User;

class Enumeration {

	String id
	String enumCode
	String sequenceId
	String description
	 
	EnumerationType enumType
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	static belongsTo = [EnumerationType]

	 
	static mapping = {
		id column: "enum_id", generator: "assigned"
		version true
	}

	static constraints = {
		         id maxSize: 36
		   enumType maxSize: 36
		   enumCode nullable: true, maxSize: 60
		 sequenceId nullable: true, maxSize: 36
		description nullable: true
		      state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
	String toString(){
		return "${description}"
		}
	}
