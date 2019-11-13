package com.profesys.scientiam.services

import java.util.Date;

import com.profesys.scientiam.security.User;

class Address {
	
	/*
	 * Domicilio de las entidades del sistema
	 * 
	 */
	String                id
	String    		 ticket
    String           street
	String           number
	String            floor
	String        apartment
	String             city
	String      addresState
	String		    zipCode
	String		    country
	String      addressType     //C-Comercial / F-Fiscal(facturacion) / Sucursal
  
	
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted


	static mapping = {
		id   generator: "assigned"
		version true
	}
	  
static constraints = {
	            street(nullable: true , display:true )
	            number(nullable: true , display:true )
	             floor(nullable: true , display:true )
	         apartment(nullable: true , display:true )
	              city(nullable: true , display:true )
	       addresState(nullable: true , display:true )
	 		   zipCode(nullable: true , display:true )
	 		   country(nullable: true , display:true )
	       addressType(nullable: true , display:true  , inList:['C','F','S'] )
		        ticket(nullable: true , display:false )
			     state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
}
