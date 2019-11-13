package com.profesys.scientiam.resource

import com.profesys.scientiam.security.User

class BookDataResource {

	 String id
	DataResource dataResource
	String textData
	String author
	String bookName
	String ticket
	 
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
		id maxSize: 36, unique: true
		dataResource maxSize: 36, unique: true
		textData nullable: true
		bookName nullable:true, display:true
		author nullable: true
		state nullable: true , display:false
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
	
	String toString(){
		return "${bookName}"
		}
}
