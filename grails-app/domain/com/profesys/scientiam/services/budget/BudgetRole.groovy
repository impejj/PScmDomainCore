package com.profesys.scientiam.services.budget

import java.util.Date;

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.PartyRole
import com.profesys.scientiam.security.User;
 

class BudgetRole  {

	String                id
	PartyRole roleType
	Party party 
	Budget budget 
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id   generator: "assigned"
		version true
	}
	static constraints = {
		budget  maxSize: 36
		party  maxSize: 36
		roleType  maxSize: 36
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
