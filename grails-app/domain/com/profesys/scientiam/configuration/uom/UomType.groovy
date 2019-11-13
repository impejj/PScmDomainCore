package com.profesys.scientiam.configuration.uom


import java.util.Date;

import com.profesys.scientiam.security.User;


class UomType {
	String id
	String  description
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
    
	static mapping = {
		id column:"uom_type_id", generator: "assigned"
		version true
	}
	static constraints = {
		id( maxSize: 36,nullable: false , display:true )
		description(nullable: false , display:true )
		state(nullable: true , display:false )
		userCreated(nullable: true , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: true , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
    }
	String toString(){
		return "${description}"
		}
	 
}
