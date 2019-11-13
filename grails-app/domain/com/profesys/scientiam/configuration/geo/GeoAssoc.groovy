package com.profesys.scientiam.configuration.geo

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

import com.profesys.scientiam.security.User;

class GeoAssoc   {

	 
 
	 
	Geo geoTo
	GeoAssocType geoAssocType
	Geo  geo 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	
 

	static belongsTo = [Geo, GeoAssocType]

 
	static constraints = {
		geo maxSize: 36
		geoTo maxSize: 36
		 state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
