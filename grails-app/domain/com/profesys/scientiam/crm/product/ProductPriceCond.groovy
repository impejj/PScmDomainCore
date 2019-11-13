package com.profesys.scientiam.crm.product

import com.profesys.scientiam.configuration.Enumeration
import com.profesys.scientiam.security.User;

class ProductPriceCond {

 
	String productPriceCondSeqId
	String condValue
 
	ProductPriceRule productPriceRule
	Enumeration operatorEnum
	Enumeration inputParamEnum

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 

	static constraints = {
		productPriceRule maxSize: 36
		productPriceCondSeqId maxSize: 36
		condValue nullable: true
		operatorEnum  nullable: true , display:true
		inputParamEnum   nullable: true , display:true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
