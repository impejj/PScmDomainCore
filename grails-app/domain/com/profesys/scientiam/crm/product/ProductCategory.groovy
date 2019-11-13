package com.profesys.scientiam.crm.product

import java.util.Date;

import com.profesys.scientiam.security.User;


class ProductCategory {
	
	String id
	// String categoryName
	String description
	String longDescription
	String categoryImageUrl
	String linkOneImageUrl
	String linkTwoImageUrl
	String detailScreen
	Character showInSelect
	 
	ProductCategoryType productCategoryType
	ProductCategory parentProductCategory
	String fontImage
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 


	static mapping = {
		id column: "product_category_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		productCategoryType  maxSize: 36
		parentProductCategory  nullable: true,maxSize: 36
		// categoryName nullable: true, maxSize: 100
		description nullable: true

		fontImage nullable: true
		longDescription nullable: true
		categoryImageUrl nullable: true
		linkOneImageUrl nullable: true
		linkTwoImageUrl nullable: true
		detailScreen nullable: true
		showInSelect nullable: true, maxSize: 1
		
		//Seguridad & Auditoria
		  state(nullable: true , display:false )
	   userCreated(nullable: true , display:false )
		 userUpdated(nullable: true , display:false )
	   dateCreated(nullable: true , display:false )
	   lastUpdated(nullable: true , display:false )  //Date  fechaactualizacion
	   dateDeleted(nullable: true , display:false )
		
		 
	}
	
	String toString(){
		return "${description}"
	}
}
