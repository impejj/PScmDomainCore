package com.profesys.scientiam.crm.contact

import com.profesys.scientiam.security.User

 

class ContactMechLink   {
  
	ContactMech contactMechIdTo
	ContactMech contactMechIdFrom
	
	 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
  	static constraints = {
		contactMechIdFrom maxSize: 36
		contactMechIdTo maxSize: 36
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
