package com.profesys.scientiam.erp.party

import java.util.Date;

import com.profesys.scientiam.security.User;
 

class PartyContactMech   {

	String id
	 
	Date fromDate
	Date thruDate
	Character allowSolicitation
	String extension
	Character verified
	String comments
	BigDecimal yearsWithContactMech
	BigDecimal monthsWithContactMech
	 
//	ContactMech contactMech
	RoleType roleType
	PartyRole partyRole
	Party party
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 
	static mapping = {
		id  generator: "assigned"
		version true
	}


	static constraints = {
		party maxSize: 36
//		contactMech maxSize: 36
		thruDate nullable: true
		allowSolicitation nullable: true, maxSize: 1
		extension nullable: true
		verified nullable: true, maxSize: 1
		comments nullable: true
		yearsWithContactMech nullable: true
		monthsWithContactMech nullable: true
		 state 						nullable: true , display:false  
		 userCreated 				nullable: true , display:false  
		 userUpdated 				nullable: true , display:false  
		 dateCreated 				nullable: true , display:false  
		 lastUpdated 				nullable: true , display:false  
		 dateDeleted 				nullable: true , display:false 
	}
}
