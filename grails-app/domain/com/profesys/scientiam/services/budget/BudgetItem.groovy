package com.profesys.scientiam.services.budget

import java.util.Date;

 

import com.profesys.scientiam.security.User;

class BudgetItem   {
	String                id
	String  budgetItemTypeSeqId
	BigDecimal amount
	String purpose
	String justification
	 
	BudgetItemType budgetItemType
	Budget budget
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
 
	static belongsTo = [Budget, BudgetItemType]

	 

	static constraints = {
		amount nullable: true
		purpose nullable: true
		justification nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
