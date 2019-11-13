package com.profesys.scientiam.services.budget

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User
import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class BudgetReview   {

	String                id
 	Date reviewDate
 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	Party party 
	BudgetReviewResultType budgetReviewResultType 
	Budget budget 
  
	static constraints = {
  
		party  maxSize: 36
		budgetReviewResultType  maxSize:20, nullable: true
		party  maxSize: 36, nullable: true
		budget  maxSize: 36, nullable: true
		budgetReviewResultType  maxSize: 36, nullable: true
		reviewDate nullable: true
		 	state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
