package com.profesys.scientiam.services.budget

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

import com.profesys.scientiam.security.User;

class BudgetScenarioApplication   {

	String id
	 
	BigDecimal amountChange
	BigDecimal percentageChange
	BudgetItem budgetItem
	BudgetScenario budgetScenario
	Budget budget
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static belongsTo = [Budget, BudgetItem, BudgetScenario]

	static mapping = {
		id column: "budget_scenario_application_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		budgetScenario maxSize: 36
		amountChange nullable: true
		percentageChange nullable: true, scale: 6
				     state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
}
