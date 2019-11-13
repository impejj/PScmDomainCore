package com.profesys.scientiam.crm.product

import java.util.Date;

import com.profesys.scientiam.security.User;

class ProductFeatureType {

	String id
	Character hasTable
	String description
	 
	ProductFeatureType parentType

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id column: "product_feature_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		parentType maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		 
	}
}
