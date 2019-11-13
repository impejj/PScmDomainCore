package com.profesys.scientiam.crm.product

import java.util.Date;

import com.profesys.scientiam.security.User;

class ProductCategoryType {

	String id
	Character hasTable
	String description
	String fontImage

	ProductCategoryType parentType

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted



	static mapping = {
		id column: "product_category_type_id", generator: "assigned"
		   version true

	}

	static constraints = {
		id maxSize: 36
		parentType nullable: true, maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		fontImage nullable: true
		state(nullable: false , display:false )
		userCreated(nullable: false , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: false , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}

	String toString(){
		return "${description}"
	}
}
