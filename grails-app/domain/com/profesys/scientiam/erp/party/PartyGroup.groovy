package com.profesys.scientiam.erp.party

import java.util.Date

import com.profesys.scientiam.security.User

class PartyGroup {

	String id
	Party  party
	String groupName
	String groupNameLocal
	String officeSiteName
	BigDecimal annualRevenue
	BigDecimal numEmployees
	String tickerSymbol
	String comments
	String logoImageUrl
	 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	static mapping = {
		id   generator: "assigned"
		version true
	}
	
	static constraints = {
		           id  nullable: false, maxsize: 36
		    groupName  nullable: true, maxSize: 100
		groupNameLocal nullable: true, maxSize: 100
		officeSiteName nullable: true, maxSize: 100
		annualRevenue  nullable: true
		numEmployees   nullable: true
		tickerSymbol   nullable: true, maxSize: 10
		comments       nullable: true
		logoImageUrl   nullable: true
		state          nullable: true , display:false 
		userCreated	   nullable: true , display:false 
		userUpdated	   nullable: true , display:false 
		dateCreated	   nullable: true , display:false 
		lastUpdated	   nullable: true , display:false 
		dateDeleted	   nullable: true , display:false 
	}
}
