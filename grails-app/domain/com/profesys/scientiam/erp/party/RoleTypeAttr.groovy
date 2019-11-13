package com.profesys.scientiam.erp.party

import java.util.Date;
 
import com.profesys.scientiam.security.User;

class RoleTypeAttr   {

	String id
	String attrName
	 
	RoleType roleTypeTo
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	 
	static belongsTo = [RoleType]
	static mapping = {
		id   generator: "assigned"
		version true
	}

	 

	static constraints = {
		id maxSize: 36
		attrName maxSize: 60
		roleTypeTo maxSize: 60,nullable: true
		 
	}
}
