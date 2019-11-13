package com.profesys.scientiam.erp.party

import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.configuration.data.DataSource
import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.security.User;

class PartyAsistent {

	String id
	String externalId
	String description
	Character isUnread
	PartyType partyType
	 
	StatusItem status
	DataSource dataSourceA
	Uom preferredCurrencyUom
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated = new Date() //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	  
	static mapping = {
		id column: "party_id", generator: "assigned"
		version true
	}

	static constraints = {
		         id nullable: false, maxSize: 36
		 externalId nullable: true, maxSize: 36
		description nullable: true
		dataSourceA nullable: true  , display:false
		   isUnread nullable: true  , maxSize: 1
		     status nullable: true  , display:true
		      state nullable: false , display:false 
		userCreated nullable: false , display:false 
		userUpdated nullable: true  , display:false 
		dateCreated nullable: false , display:false 
		lastUpdated nullable: true  , display:false 
		dateDeleted nullable: true  , display:false 
		
	}
	String toString(){
		return "${description}"
		}
}
