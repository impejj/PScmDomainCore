package com.profesys.scientiam.crm.product

import java.util.Date;

import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.security.User;


class ProductFeature {

	String id
	String description
	BigDecimal numberSpecified
	BigDecimal defaultAmount
	BigDecimal defaultSequenceNum
	String abbrev
	String idCode
	 
	ProductFeatureType productFeatureType
	Uom uom
	ProductFeatureCategory productFeatureCategory
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	 
	static belongsTo = [ProductFeatureCategory, ProductFeatureType, Uom]

	 

	static mapping = {
		id column: "product_feature_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
		numberSpecified nullable: true, scale: 6
		defaultAmount nullable: true
		defaultSequenceNum nullable: true
		abbrev nullable: true, maxSize: 36
		idCode nullable: true, maxSize: 60
				state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
		 
	}
}
