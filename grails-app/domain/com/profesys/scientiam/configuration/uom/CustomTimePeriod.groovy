package com.profesys.scientiam.configuration.uom

import java.util.Date;

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User;



class CustomTimePeriod {

	String id
	BigDecimal periodNum
	String periodName
	Date fromDate
	Date thruDate
	Character isClosed
 
	CustomTimePeriod customTimePeriodTo
	Party party
	PeriodType periodType

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted


	static mapping = {
		id column: "custom_time_period_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		customTimePeriodTo maxSize: 36
		periodNum nullable: true
		periodName nullable: true, maxSize: 100
		fromDate nullable: true
		thruDate nullable: true
		isClosed nullable: true, maxSize: 1
 		     state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
}
