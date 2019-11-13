package com.profesys.scientiam.configuration.uom


import java.util.Date;

import com.profesys.scientiam.security.User;


class UomConversionDated {

	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
    
	
	static constraints = {
				      state(nullable: true , display:false )
				userCreated(nullable: true , display:false )
				userUpdated(nullable: true , display:false )
			    dateCreated(nullable: true , display:false )
				lastUpdated(nullable: true , display:false )
				dateDeleted(nullable: true , display:false )
    }
	
	static mapping = {
		// detail type: "text"  //Para los campos de texto largo
	}
}
