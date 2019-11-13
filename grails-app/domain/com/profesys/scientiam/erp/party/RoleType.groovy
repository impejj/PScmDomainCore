package com.profesys.scientiam.erp.party

import com.profesys.scientiam.security.User

import java.util.Date;




class RoleType {

	String id
	Character hasTable
	String description
	RoleType parentType

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 
	// static belongsTo = [   parentType: RoleType ]
	
	 //static mappedBy = [   parentType: "none" ]
	 
 
 
	static mapping = {
		id column: "role_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		parentType nullable: true

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
