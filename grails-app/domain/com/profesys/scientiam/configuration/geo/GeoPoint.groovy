package com.profesys.scientiam.configuration.geo

import java.util.Date;

import com.profesys.scientiam.configuration.data.DataSource
import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.security.User;

class GeoPoint {

	String id
	String latitude
	String longitude
	BigDecimal elevation
	String information
	

	String elevationUomId 
	Uom uom
	DataSource dataSource
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	 

	static mapping = {
		id column: "geo_point_id", generator: "assigned"
		version true
	}

	static constraints = {
		
		id maxSize: 36
		latitude maxSize: 60
		longitude maxSize: 60
		elevation nullable: true, scale: 6
		information nullable: true

		state nullable: true , display:false
		userCreated nullable: true , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false

	}
}
