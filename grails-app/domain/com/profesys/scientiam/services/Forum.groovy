package com.profesys.scientiam.services

import java.util.Date;

import com.profesys.scientiam.security.User;

class Forum {
	String                id
    String        description
    String			   detail
	Date			valueDate 
	
	
	//Seguridad & Auditoria
	String        ticket
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	
	static constraints = {
		
				   
	        description(nullable: false , display:true )
			     detail(nullable: true  , display:true, size:0..65535  )
			  valueDate(nullable: true  , display:true )
				
		        ticket(nullable: true , display:false )
				 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
	
	static mapping = {

			id   generator: "assigned"

	   detail type: 'text'
	}
	String toString(){
		return "${id}- ${description}"
		}
}
