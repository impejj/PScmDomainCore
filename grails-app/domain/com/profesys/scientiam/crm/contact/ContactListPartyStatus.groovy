package com.profesys.scientiam.crm.contact

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User
 

class ContactListPartyStatus   {

 
	Date fromDate
	Date statusDate
	String statusId
 
	String optInVerifyCode
  	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	ContactListParty contactList 
	Party party
	 
	static constraints = {
		contactList  maxSize: 36
		party  maxSize: 36
		statusId nullable: true, maxSize: 36
		 
		optInVerifyCode nullable: true, maxSize: 60
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
