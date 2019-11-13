package com.profesys.scientiam.configuration

import java.util.Date;

import com.profesys.scientiam.security.User;


class UserEnterprise {

	//Tabla con las empresas que administramos en el sistema
	 
	User               user
	Enterprise   enterprise
	 

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	static constraints = {
		       user(nullable: false , display:true )
			   enterprise(nullable: false , display:true )
			   
 		     
			  state(nullable: true , display:false )
		userCreated(nullable: true , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: true , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}
	
	static mapping = {
		table 'userenterprise'
		
		 
		 
	}
	String toString(){
		return "${id}- ${user}-${enterprise}"
		}
}
