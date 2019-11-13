package com.profesys.scientiam.crm.product

import java.util.Date;
 

import com.profesys.scientiam.security.User;

class ProductAttribute  {

	String productId
	String attrName
	String attrValue
	String attrType
	 
	Product productOrigin
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static constraints = {
		productOrigin maxSize: 36
		productId maxSize: 36
		attrName maxSize: 60
		attrValue nullable: true
		attrType nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
