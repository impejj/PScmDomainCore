package com.profesys.scientiam.resource

import java.util.Date;

import com.profesys.scientiam.security.User;

class ExternalFile {

    String id
	DataResource dataResource
 
	String name
	int size
	String extension
	DataResourceRepository dataResourceRepository


	 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated   //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static mapping = {
		id  generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
 
		dataResource maxSize: 36 
		dataResourceRepository  maxSize: 36 ,nullable: true
		state nullable: false , display:false
		  name nullable: true
		  size nullable: true
		  extension nullable: true
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
