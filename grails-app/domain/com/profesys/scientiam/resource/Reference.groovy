package com.profesys.scientiam.resource

import com.profesys.scientiam.resource.DataResource

import java.util.Date;

import com.profesys.scientiam.security.User;

class Reference {
	String  					 id
		DataResource dataResource
    ReferenceType referenceType

	String                   detail
	Date                   dateFrom    //Fecha de la lista
	Date                   dateThru
 	Boolean               completed    

	Boolean             permanent    //S/y o N //Listas permanentes que se van renovando a través del tiempo
	Boolean              template     //S/y o N Si utilizamos esta lista como plantilla de otras
	
	 
	 //Seguridad & Auditoria
	Integer           		  state   // 0-Borrado 1-ok  2-modificado
	User  	   		    userCreated
	User  	   		    userUpdated
	Date       		    dateCreated  //Date  fechaalta
	Date        		lastUpdated  //Date  fechaactualizacion
	Date        		dateDeleted
	
	
	static mapping = {
		id   generator: "assigned"
		version true
		 
	}
	//static hasMany = [listDetail:Ws_listDetail]
static constraints = {
id maxSize: 36, unique: true
		dataResource maxSize: 36, unique: true
		      dateFrom(	nullable: true  , display:true  )
			  dateThru(	nullable: true  , display:true  )
			    detail(	nullable: true  , display:true, size:0..65535   )
		     permanent(	nullable: true  , display:true  )
		      template(	nullable: true  , display:true  )
 		     completed(	nullable: true  , display:true  )
		   
		 referenceType nullable: true  , display:true
			    
			     state(	nullable: true , display:false )
		   userCreated(	nullable: true , display:false )
		   userUpdated(	nullable: true , display:false )
		   dateCreated(	nullable: true , display:false )
		   lastUpdated(	nullable: true , display:false )
		   dateDeleted(	nullable: true , display:false )
	}

String toString(){
	return "${dataResource?.description}"
	}

 
}
