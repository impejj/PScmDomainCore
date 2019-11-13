package com.profesys.scientiam.services.budget

import java.util.Date;

import com.profesys.scientiam.configuration.uom.CustomTimePeriod
import com.profesys.scientiam.security.User;

class Budget {

	String id
	String comments
	 
	CustomTimePeriod customTimePeriod
	BudgetType budgetType
	String ticket

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	 

	static mapping = {
		id column: "budge_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		comments nullable: true
	    state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
	
	String toString(){
		return "${id} "
		}
}
