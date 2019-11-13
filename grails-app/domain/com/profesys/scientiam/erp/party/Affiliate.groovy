package com.profesys.scientiam.erp.party

import java.util.Date;

import com.profesys.scientiam.security.User;

class Affiliate {
	
	Party party
	String affiliateName
	String affiliateDescription
	String yearEstablished
	String siteType
	String sitePageViews
	String siteVisitors
	Date dateTimeCreated
	Date dateTimeApproved
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
 

	static constraints = {
	 
		affiliateName nullable: true, maxSize: 100
		affiliateDescription nullable: true
		yearEstablished nullable: true, maxSize: 10
		siteType nullable: true
		sitePageViews nullable: true
		siteVisitors nullable: true
		dateTimeCreated nullable: true
		dateTimeApproved nullable: true
		  state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false 
	}
}
