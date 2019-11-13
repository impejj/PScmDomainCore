package com.profesys.scientiam.erp.party

import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.configuration.data.DataSource
import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.security.User;

class PartyAccount {

	String id
	 Party party
	String email
	 
	String phoneHome
	String phoneMobile
	String phoneWork
	 String phoneOther
	String phoneFax
	String primaryAddressStreet
	String primaryAddressCity
	 String primaryAddressState
	 String primaryAddressPostalcode
	 String primaryAddressCountry
	 String altAddressStreet
	 String altAddressCity
	 String altAddressState
	 String altAddressPostalcode
	 String altAddressCountry
	 String billingAddressStreet
	 String billingAddressCity
	 String billingAddressState
	 String billingAddressPostalcode
	 String billingAddressCountry 
	 String shippingAddressStreet
	 String shippingAddressCity
	 String shippingAddressState
	 String shippingAddressPostalcode
	 String shippingAddressCountry
	 
	 
	 String businessAddressStreet
	 String businessAddressCity
	 String businessAddressState
	 String businessAddressPostalcode
	 String businessAddressCountry
	 String accountName
	 String accountDescription
	
	  String managersName
	
	 
	 
	/*  
	  `account_type` varchar(50) DEFAULT NULL,
	 `industry` varchar(50) DEFAULT NULL,
	 `annual_revenue` varchar(100) DEFAULT NULL,
	  
	 `rating` varchar(100) DEFAULT NULL,
	 `phone_office` varchar(100) DEFAULT NULL,
	 `phone_alternate` varchar(100) DEFAULT NULL,
	 `website` varchar(255) DEFAULT NULL,
	 `ownership` varchar(100) DEFAULT NULL,
	 `employees` varchar(10) DEFAULT NULL,
 
	 */
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	  
	static mapping = {
		id   generator: "assigned"
		version true
	}
	static constraints = {
		         id nullable: false, maxSize: 36

		      state nullable: false , display:false 
		userCreated nullable: false , display:false 
		userUpdated nullable: true  , display:false 
		dateDeleted nullable: true  , display:false 
		
		
		 email nullable: true  , display:true 
		
	     phoneHome nullable: true  , display:true
	     phoneMobile nullable: true  , display:true
	     phoneWork nullable: true  , display:true
		  phoneOther nullable: true  , display:true
	     phoneFax nullable: true  , display:true
	    primaryAddressStreet               nullable: true  , display:true,maxSize: 150     
		primaryAddressCity                 nullable: true  , display:true,maxSize: 100     
		primaryAddressState                nullable: true  , display:true,maxSize: 100     
		primaryAddressPostalcode           nullable: true  , display:true,maxSize: 36      
		primaryAddressCountry              nullable: true  , display:true,maxSize: 100     
		altAddressStreet                   nullable: true  , display:true,maxSize: 150     
		altAddressCity                     nullable: true  , display:true,maxSize: 100     
		altAddressState                    nullable: true  , display:true,maxSize: 100     
		altAddressPostalcode               nullable: true  , display:true,maxSize: 36      
		altAddressCountry                  nullable: true  , display:true,maxSize: 100     
		billingAddressStreet               nullable: true  , display:true,maxSize: 150     
		billingAddressCity                 nullable: true  , display:true,maxSize: 100     
		billingAddressState                nullable: true  , display:true,maxSize: 100     
		billingAddressPostalcode           nullable: true  , display:true,maxSize: 36      
		billingAddressCountry              nullable: true  , display:true,maxSize: 100     
		shippingAddressStreet               nullable: true  , display:true,maxSize: 150    
		shippingAddressCity                 nullable: true  , display:true,maxSize: 100    
		shippingAddressState                nullable: true  , display:true,maxSize: 100    
		shippingAddressPostalcode           nullable: true  , display:true,maxSize: 36     
		shippingAddressCountry              nullable: true  , display:true,maxSize: 100    

   
		
		
		
		
	}
	String toString(){
		return "${party}"
		}
}
