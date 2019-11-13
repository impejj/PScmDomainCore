package com.profesys.scientiam.configuration.geo

import java.util.Date;

import com.profesys.scientiam.security.User;

class GeoType {

	String id
	Character hasTable
	String description
	 
	GeoType parentTypeId
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id column: "geo_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		parentTypeId maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		  state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false 
	}
}
