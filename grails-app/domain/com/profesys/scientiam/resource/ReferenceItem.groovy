package com.profesys.scientiam.resource


	import java.util.Date;

import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.security.User;

class ReferenceItem {

	Reference            	     reference
	Integer                sequentialOrder
	String      		       description    //
	String          		 	    detail
	Integer        				complexity     //Cuan urgente debe resolverse
	Integer           			  priority        //Cuan importante es el registro
	Boolean       			     completed    //Terminado
	Uom                           uom
	Double 						quantity
	String            			     link1
	String            			     link2
	
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	  
static constraints = {
		   sequentialOrder(nullable: true , display:true   )
		   description(nullable: false  , display:true  )
		   detail(nullable: true  , display:true, size:0..65535   )
		   complexity(nullable: true , display:true, range:1..10   ) 
		   priority (nullable: true , display:true, range:1..10   ) 
		   completed (nullable: true , display:true  )
		   uom (nullable: true , display:true  )
		   quantity (nullable: true , display:true  )
		   link1(nullable: true , display:true, url:true  )
		   link2(nullable: true , display:true, url:true   )
		   
				
			     state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}


static mapping = {
	detail type: "text"
}
String toString(){
	return "${id}- ${description}"
	}

 
}
