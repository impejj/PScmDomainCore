package com.profesys.scientiam.crm.contact

import java.util.Date;

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User;

class ContactList {

	String id
	String contactListName
	String description
	String comments
	Character isPublic
	Character singleUse
	String verifyEmailFrom
	String verifyEmailScreen
	String verifyEmailSubject
	String verifyEmailWebSiteId
	String optOutScreen
	 
	ContactListType contactListType
	Party party

 
	ContactMechType contactMechType

	//Seguridad & Auditoria
	Integer         state   // 0-Borrado 1-ok  2-modificado
	User  	  userCreated
	User  	  userUpdated
	Date      dateCreated  //Date  fechaalta
	Date      lastUpdated  //Date  fechaactualizacion
	Date      dateDeleted
	

	static mapping = {
		id column: "contact_list_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		contactListName nullable: true, maxSize: 100
		description nullable: true
		comments nullable: true
		isPublic nullable: true, maxSize: 1
		singleUse nullable: true, maxSize: 1
		verifyEmailFrom nullable: true
		verifyEmailScreen nullable: true
		verifyEmailSubject nullable: true
		verifyEmailWebSiteId nullable: true, maxSize: 36
		optOutScreen nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
