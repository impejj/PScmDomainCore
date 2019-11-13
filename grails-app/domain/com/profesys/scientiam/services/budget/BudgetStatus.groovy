package com.profesys.scientiam.services.budget

import java.util.Date;
 
import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.security.User;

class BudgetStatus   {

	String                id
	Date statusDate
	String comments
	 
	StatusItem status 
	Budget budget 
	
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
		budget  maxSize: 36
		status  maxSize: 36
		 
		statusDate nullable: true
		comments nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
