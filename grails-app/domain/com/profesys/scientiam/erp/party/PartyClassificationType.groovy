package com.profesys.scientiam.erp.party

import java.util.Date;

import com.profesys.scientiam.security.User;

class PartyClassificationType {
	String id
	Character hasTable
	String description

	PartyClassificationType parentType
	 
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted  //Date  fecha borrado logico
 

	static mapping = {
		id column: "party_classification_type_id", generator: "assigned"
		version true
	}
 

	static constraints = {
		        id maxSize: 36
		parentType maxSize: 36,  nullable: true
		  hasTable nullable: true, maxSize: 1
		description nullable: true, maxSize: 255
		
		      state(nullable: true , display:false )
		userCreated(nullable: true , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: true , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}

	String toString(){
		return "${description}"
	}

}
