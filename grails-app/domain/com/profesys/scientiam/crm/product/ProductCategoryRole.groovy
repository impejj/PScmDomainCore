package com.profesys.scientiam.crm.product


import java.util.Date;

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.PartyRole
import com.profesys.scientiam.security.User;
 

class ProductCategoryRole   {
    String id
	Date fromDate
	Date thruDate
	String comments
	 
	ProductCategory productCategory 
	PartyRole roleType
	Party party
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted


	static mapping = {
		id column: "product_category_role_id", generator: "assigned"
		version true

	}

	static constraints = {
		productCategory  maxSize: 36
		party  maxSize: 36
		 
		roleType  maxSize: 36
		thruDate nullable: true
		comments nullable: true
		 state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
