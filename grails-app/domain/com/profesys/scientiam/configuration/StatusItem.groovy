package com.profesys.scientiam.configuration

import java.util.Date;

import com.profesys.scientiam.security.User;


class StatusItem {

	String id
	String statusCode
	String sequenceId
	String description
	 
	StatusType statusType
	String          fontImage
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	static belongsTo = [StatusType]

	 

	static mapping = {
		id column: "status_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		statusCode nullable: true, maxSize: 60
		sequenceId nullable: true, maxSize: 36
		description nullable: true
		fontImage nullable: true
		state(nullable: false , display:false )
		userCreated(nullable: false , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: false , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}
	String toString(){
		return "${description}"
	}
	 
}
