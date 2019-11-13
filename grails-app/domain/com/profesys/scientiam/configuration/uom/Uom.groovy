package com.profesys.scientiam.configuration.uom

import java.util.Date;

import com.profesys.scientiam.security.User;

class Uom {

	String id
	String abbreviation
	String description
	String defaultList  //Para incluir estos datos en las busquedas recurrentes y que no 
						// requiera toda la informacion 
	 
	UomType uomType
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	 static mapping = {
		id column: "uom_id", generator: "assigned"
		version true
 	}

	static constraints = {
		id maxSize: 36
		abbreviation nullable: true, maxSize: 60
		description nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
	
	String toString(){
		return "${description}"
		}
}
