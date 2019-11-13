package com.profesys.scientiam.erp.party

import java.util.Date
 

import com.profesys.scientiam.security.User

class PartyRole  {

	String id  
	RoleType roleType
	Party party
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	 

 
	static belongsTo = [Party, RoleType]

	static mapping = {
		id   generator: "assigned"
		version true
	}
	static constraints = {
		id maxSize:  36
		party maxSize: 36
		roleType maxSize: 36
		 
		 
	
	   
	   state         nullable: false
	   userCreated   nullable: false
	   userUpdated   nullable: true
	   dateCreated   nullable: false
	   lastUpdated   nullable: true
	   dateDeleted   nullable: true
	}
	
	String toString(){
		return "${id}"
		}
	
}
