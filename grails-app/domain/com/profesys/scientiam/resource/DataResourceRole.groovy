package com.profesys.scientiam.resource

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.PartyRole
import com.profesys.scientiam.security.User
 

class DataResourceRole   {

 
 
	Date fromDate
	Date thruDate
 
	DataResource dataResource
	PartyRole partyRole
	Party     party 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated   //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	static belongsTo = [DataResource, PartyRole]

	 

	static constraints = {
		dataResource maxSize: 36
		party maxSize: 36,nullable: true
		partyRole maxSize: 36,nullable: true
		thruDate nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
