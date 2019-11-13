package com.profesys.scientiam.erp.party

import java.util.Date;

import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.security.User;

class PartyCurrency {
	
	//Monedas Aceptadas por el participante
	String id 
	 
	 String positionTitle
	
	Party   party
	Uom     currency
 
 
	
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
		party maxSize: 36,nullable: true , display:true
		currency   maxSize: 36
	 
		
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
