package com.profesys.scientiam.erp.party

import java.util.Date

import com.profesys.scientiam.configuration.uom.UomType

import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.configuration.geo.Geo

import com.profesys.scientiam.security.User

import com.profesys.scientiam.configuration.data.DataSource
import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.configuration.StatusItem

import com.profesys.scientiam.security.User


class Party {

	String id
	String externalId
	String description
	Character isUnread
	PartyType partyType
	User  user

	String cuit
	String iibb
	// 
	StatusItem status
	//  DataSource dataSource
	Uom preferredCurrencyUom
	
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

	String         			orderTag
	String         			ticket    		//Es igual al id
	
	String         			tagCloud
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	  
	static mapping = {
		id column: "party_id", generator: "assigned"
		version true
	}

	static constraints = {
		         id nullable: false, maxSize: 36
		 externalId nullable: true, maxSize: 36
		partyType nullable: false
		description nullable: true
		user         nullable: true  , display:false
		// dataSource nullable: true  , display:false
		tagCloud  	nullable: true
		 orderTag 	 nullable: true
		   isUnread nullable: true  , maxSize: 1
			cuit  nullable: true  , display:true
			iibb nullable: true  , display:true
			  email nullable: true  , display:true

			  phoneHome nullable: true  , display:true
			  phoneMobile nullable: true  , display:true
			  phoneWork nullable: true  , display:true
			  phoneOther nullable: true  , display:true
			  phoneFax  nullable: true  , display:true
			  primaryAddressStreet nullable: true  , display:true
			  primaryAddressCity nullable: true  , display:true
			  primaryAddressState nullable: true  , display:true
			  primaryAddressPostalcode nullable: true  , display:true
			  primaryAddressCountry nullable: true  , display:true
			  altAddressStreet nullable: true  , display:true
			  altAddressCity nullable: true  , display:true
			  altAddressState nullable: true  , display:true
			  altAddressPostalcode nullable: true  , display:true
			  altAddressCountry nullable: true  , display:true
		   		     status nullable: true  , display:true
		      state nullable: false , display:false 
				userCreated nullable: true , display:false
				userUpdated nullable: true  , display:false
				dateDeleted nullable: true  , display:false
		
	}
	String toString(){
		return "${description}"
		}
}
