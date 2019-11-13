package com.profesys.scientiam.crm.contact

import java.util.Date;

import com.profesys.scientiam.configuration.geo.Geo
import com.profesys.scientiam.configuration.geo.GeoPoint
import com.profesys.scientiam.security.User;

class PostalAddress {

	 
	ContactMech contactMech
	String toName
	String attnName
	String address1
	String address2
	String directions
	String city
	String postalCode
	String postalCodeExt
	 
	Geo provinceGeo 
	Geo postalCodeGeo 
	Geo countryGeo 
	Geo countyGeo 
	GeoPoint geoPoint

	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
 

	static constraints = {
		 
		contactMech maxSize: 36, unique: true
		toName nullable: true, maxSize: 100
		attnName nullable: true, maxSize: 100
		address1 nullable: true
		address2 nullable: true
		directions nullable: true
		city nullable: true, maxSize: 100
		postalCode nullable: true, maxSize: 60
		postalCodeExt nullable: true, maxSize: 60
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
		 
	}
}
