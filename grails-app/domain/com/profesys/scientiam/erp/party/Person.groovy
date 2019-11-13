package com.profesys.scientiam.erp.party

import com.profesys.scientiam.security.User
import com.profesys.scientiam.configuration.Enumeration

class Person {

 	String id
	Party  party
	String salutation
	String firstName
	String middleName
	String lastName
	String personalTitle
	String suffix
	String nickname
	String firstNameLocal
	String middleNameLocal
	String lastNameLocal
	String otherLocal
	String memberId
	Character gender
	Date birthDate
	Date deceasedDate
	Double height
	Double weight
	String mothersMaidenName
	Character maritalStatus
	String socialSecurityNumber
	String passportNumber
	Date passportExpireDate
	Double totalYearsWorkExperience
	String comments
	String occupation
	BigDecimal yearsWithEmployer
	BigDecimal monthsWithEmployer
	Character existingCustomer
	String cardId
	
	String referredBy
	String assistantsName
	String assistantsPhone
	String jobTitle
	
	 String website
	String twitter
	String facebook
	String googleplus
	String skype
	String linkedin
	String instagram
	String foursquare
	String email
	String phone
	String mobile	   
	Enumeration employmentStatusEnum
	Enumeration residenceStatusEnum
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static mapping = {
		id name:"id", generator: "assigned"
		version true
	}

	static constraints = {
		
		id maxSize: 36
		party nullable: false
		 
		salutation nullable: true, maxSize: 100
		firstName nullable: true, maxSize: 100
		middleName nullable: true, maxSize: 100
		lastName nullable: true, maxSize: 100
		personalTitle nullable: true, maxSize: 100
		suffix nullable: true, maxSize: 100
		nickname nullable: true, maxSize: 100
		firstNameLocal nullable: true, maxSize: 100
		middleNameLocal nullable: true, maxSize: 100
		lastNameLocal nullable: true, maxSize: 100
		otherLocal nullable: true, maxSize: 100
		memberId nullable: true, maxSize: 36
		gender nullable: true
		birthDate nullable: true
		deceasedDate nullable: true
		height nullable: true
		weight nullable: true
		mothersMaidenName nullable: true
		maritalStatus nullable: true
		socialSecurityNumber nullable: true
		passportNumber nullable: true
		passportExpireDate nullable: true
		totalYearsWorkExperience nullable: true
		comments nullable: true
		occupation nullable: true, maxSize: 100
		yearsWithEmployer nullable: true
		monthsWithEmployer nullable: true
		existingCustomer nullable: true
		cardId nullable: true, maxSize: 60

		employmentStatusEnum nullable: true
		residenceStatusEnum  nullable: true
 		website nullable: true
		 
		 referredBy	nullable: true    	, maxSize:255
		 assistantsName	nullable: true    	, maxSize:255
		 assistantsPhone	nullable: true    	, maxSize:255
		 jobTitle	nullable: true    	, maxSize:255
		 
		    twitter nullable: true
		    facebook nullable: true
		    googleplus nullable: true
		    skype nullable: true
		    linkedin nullable: true
		    instagram nullable: true
		    foursquare nullable: true
			 email nullable: true
			 phone nullable: true
	                 mobile nullable: true


		state(nullable: true , display:false )
		userCreated(nullable: true , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: true , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}
	String toString(){
		return "${lastName}, ${firstName}"
		}
}
