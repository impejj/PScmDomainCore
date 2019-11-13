package com.profesys.scientiam.crm.product


import java.util.Date;

 

import com.profesys.scientiam.security.User;

class ProductCategoryTypeAttr   {

	String id
	String attrName
	 
	ProductCategoryType productCategoryType

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	
	 

	static belongsTo = [ProductCategoryType]

	static mapping = {
		id column: "product_category_type_attr_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		attrName maxSize: 60
		 state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
