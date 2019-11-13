package com.profesys.scientiam.configuration.uom


import java.util.Date;

import com.profesys.scientiam.security.User;


class UomGroup {
        
		Uom 		uom
		String           description
		
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
    
	
	static constraints = {
		uom(nullable: false , display:false )
		description(nullable: false , display:true )
		
		
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
