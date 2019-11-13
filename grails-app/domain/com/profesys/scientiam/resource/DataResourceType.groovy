package com.profesys.scientiam.resource

import java.util.Date;

import com.profesys.scientiam.security.User;


class DataResourceType {

	String id
	Character hasTable
	String description
	String           fontImage
	DataResourceType parentType
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated   //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 

	static mapping = {
		id column: "data_resource_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		fontImage  nullable: true
		parentType  nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
