package com.profesys.scientiam.crm.product

import java.util.Date;

import com.profesys.scientiam.security.User;

class ProductManufacturingRule {

	String id
	String ruleSeqId
	Date fromDate
	String ruleOperator
	Double quantity
	String description
	Date thruDate
 
	ProductFeature productFeature
	Product productIdInSubst
	Product productIdIn
	Product productIdFor
	Product producttId

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	static belongsTo = [Product, ProductFeature]

	static mapping = {
		id column: "rule_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		ruleSeqId nullable: true, maxSize: 36
		fromDate nullable: true
		ruleOperator nullable: true, maxSize: 36
		quantity nullable: true
		description nullable: true
		thruDate nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
