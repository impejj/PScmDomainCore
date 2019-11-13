package com.profesys.scientiam.services

	import java.util.Date;

import com.profesys.scientiam.security.User;

class TimeTracker {
	String                id
	String            ticket
	Integer   internalOrder
	String      description    //
	String           detail
	Integer        minutesWorked //
	Date           workDate
	User              worker
	
	
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted


static constraints = {
		   description(nullable: true  , display:true  )
			   minutesWorked(nullable: true  , display:true  )
			  workDate(nullable: false  , display:true )
		 internalOrder(nullable: true  , display:false )
				detail(nullable: true , display:true, size:0..65535   )
				
			     state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false ) 
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}

static mapping = {
		id          column: 'id', generator: 'assigned'
		version true


	detail type: "text"
}


String toString(){
	return "${id}- ${description}"
	}

 
}
