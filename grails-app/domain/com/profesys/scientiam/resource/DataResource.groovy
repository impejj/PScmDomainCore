package com.profesys.scientiam.resource

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.security.User

class DataResource {

	String id 


 	String resourcePath   //relative to repositories 
	String  description
 
	DataResourceType dataResourceType
	Character isPublic

	StatusItem statusItem
 
	String ticket
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated   //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id   column: "data_resource_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		resourcePath  nullable: true , display:false
		description  nullable: false , display:false
		isPublic nullable: true, maxSize: 1
		ticket nullable: true
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
