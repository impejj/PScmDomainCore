package com.profesys.scientiam.crm.product

import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.security.User;

class ProductGroupOrder {

	String id
	Date fromDate
	Date thruDate
	BigDecimal reqOrderQty
	BigDecimal soldOrderQty
	 
	Product product
	//JobSandbox jobSandbox
	StatusItem statusItem
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated   //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	static mapping = {
		id column: "group_order_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		fromDate nullable: true
		thruDate nullable: true
		reqOrderQty nullable: true, scale: 6
		soldOrderQty nullable: true, scale: 6
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
