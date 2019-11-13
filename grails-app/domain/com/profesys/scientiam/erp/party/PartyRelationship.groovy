package com.profesys.scientiam.erp.party

import com.profesys.scientiam.security.User



class PartyRelationship {
	String id 
	String relationshipName
	
	PartyRelationshipType partyRelantionshipType
	String positionTitle
	
	PartyRole partyRoleFrom
	PartyRole partyRoleTo
	//	String partyIdFrom
//	String partyIdTo
//	String roleTypeIdFrom
//	String roleTypeIdTo
	Date   fromDate
	Date   thruDate
//	String statusId
 
//	String permissionsEnumId
	String comments
	
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
		id maxSize: 36,nullable: true , display:true
		partyRoleFrom maxSize: 36,nullable: true , display:true
		partyRoleTo   maxSize: 36
	 
		fromDate  nullable: true , display:true
		thruDate  nullable: true , display:true
		comments nullable: true, maxSize: 255
		
		state nullable: true , display:false  // 0-Borrado 1-ok  2-modificado
		userCreated nullable: true , display:false
		userUpdated nullable: true , display:false
		dateCreated  nullable: false , display:false
		lastUpdated nullable: false , display:false 
		dateDeleted nullable: true , display:false
		
	}
	String toString(){
		return "${relationshipName}" 
		}
}
