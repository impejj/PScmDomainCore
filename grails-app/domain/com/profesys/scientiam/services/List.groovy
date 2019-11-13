package com.profesys.scientiam.services

	import java.util.Date;

import com.profesys.scientiam.security.User;

class List {
	String                id
	String      description    //
	Date           dateList    //Fecha de la lista
	
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	  
static constraints = {
		   description(nullable: true  , display:true  )
		      dateList(nullable: true  , display:true  )
				
			     state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}

String toString(){
	return "${id}- ${description}"
	}


}
