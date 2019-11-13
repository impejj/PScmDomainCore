package com.profesys.scientiam.resource

import com.profesys.scientiam.security.User

 

class DataResourcePurpose   {

 
	String id
//	ContentPurposeType contentPurposeType
	DataResource dataResource
	String   purpose
	 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated   //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
//	static belongsTo = [ContentPurposeType, DataResource]

	 

	 static mapping = {
		id   generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		purpose maxSize: 244
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
