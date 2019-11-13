package com.profesys.scientiam.configuration.uom


import java.util.Date;

import com.profesys.scientiam.security.User;


class UomConversion {
		Uom uom
		Uom uomTo
		BigDecimal conversionFactor
		String     customMethodId
		BigDecimal decimalScale
		String     roundingMode
 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
    
	
	static constraints = {
		
		                uom(nullable: false , display:false )
		              uomTo(nullable: false , display:false )
		   conversionFactor(nullable: true , display:false )
		     customMethodId(nullable: true , display:false )
		       decimalScale(nullable: true , display:false )
		       roundingMode(nullable: true , display:false )
		
		
		
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
