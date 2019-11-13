package com.profesys.scientiam.services.budget

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

import com.profesys.scientiam.security.User;

class BudgetAttribute   {

	String                id
	String attrName
	String attrValue
	Budget budgetId 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
   

	static constraints = {
		budgetId maxSize: 36
		 
		attrName maxSize: 60
		attrValue nullable: true
		
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: false , display:false
		dateDeleted nullable: true , display:false
	}
	String toString(){
		return "${attrName}"
		}
}
