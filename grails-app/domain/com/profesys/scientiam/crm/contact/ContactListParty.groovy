package com.profesys.scientiam.crm.contact

import java.util.Date;
 

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User;

class ContactListParty  {

//	String contactListId
//	String partyId
	Date fromDate
	Date thruDate
	 
	ContactList contactList
	ContactMech contactMech
	StatusItem statusItem
	Party party

	//Seguridad & Auditoria
	Integer         state   // 0-Borrado 1-ok  2-modificado
	User  	  userCreated
	User  	  userUpdated
	Date      dateCreated  //Date  fechaalta
	Date      lastUpdated  //Date  fechaactualizacion
	Date      dateDeleted
	
	 
	static constraints = {
		contactList maxSize: 36
		party maxSize: 36
		
		
		fromDate nullable: true
		thruDate nullable: true
		 state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
