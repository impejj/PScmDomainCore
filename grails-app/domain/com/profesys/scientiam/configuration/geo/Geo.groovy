package com.profesys.scientiam.configuration.geo

import java.util.Date;

import com.profesys.scientiam.security.User;

class Geo {

	String id
	String geoName
	String geoCode
	String geoSecCode
	String abbreviation
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	GeoType geoType

	 
	static belongsTo = [GeoType]

	 

	static mapping = {
		id column: "geo_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		geoName nullable: true, maxSize: 100
		geoCode nullable: true, maxSize: 60
		geoSecCode nullable: true, maxSize: 60
		abbreviation nullable: true, maxSize: 60
		  state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false 
	}
}
