package com.profesys.scientiam.services.budget

import java.util.Date;

 

import com.profesys.scientiam.security.User;

class BudgetScenarioRule   {

	String                id
	BigDecimal amountChange
	BigDecimal percentageChange
	BudgetScenario budgetScenario 
	BudgetItemType budgetItemType 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id          column: 'id', generator: 'assigned'
		version true


	}

	static constraints = {
		budgetScenario  maxSize: 36
		budgetItemType  maxSize: 36
	 
		amountChange nullable: true
		percentageChange nullable: true, scale: 6
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
