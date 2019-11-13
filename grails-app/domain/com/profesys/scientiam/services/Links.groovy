package com.profesys.scientiam.services

import java.util.Date;

import com.profesys.scientiam.security.User;

class Links {

    
	//Estos son los pedidos que se realizan y que despues de una evaluacion se pueden 
	//transformar en un task o issue
	//Puede tener todo el conjunto de servicios asociados ( links-documentos-

	String                id
    String             ticket   
	String                url
	String			   detail
			
							
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	
	static constraints = {
		
	                       url(nullable: false , display:true ,url: true)
	                    detail(nullable: false , display:true, size:0..65535   )
		   			    ticket(nullable: false , display:false )
				 
						 state(nullable: true , display:false )
				   userCreated(nullable: true , display:false )
				   userUpdated(nullable: true , display:false )
				   dateCreated(nullable: true , display:false )
				   lastUpdated(nullable: true , display:false )
				   dateDeleted(nullable: true , display:false )
	}
	
	static mapping = {
		
	   detail type: 'text'
	}
	String toString(){
		return "${id}- ${url}"
		}
}
