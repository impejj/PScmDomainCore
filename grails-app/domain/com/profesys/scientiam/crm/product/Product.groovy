package com.profesys.scientiam.crm.product

import com.profesys.scientiam.configuration.uom.UomType

import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.configuration.geo.Geo
import com.profesys.scientiam.configuration.Enumeration
import com.profesys.scientiam.security.User


class Product {
		 
	String id
	Date introductionDate
	Date releaseDate
	Date supportDiscontinuationDate
	Date salesDiscontinuationDate
	Character salesDiscWhenNotAvail
	String internalName
	String brandName
	String comments
	String productName
	String description
	String detail
	String priceDetailText
	String smallImageUrl
	String mediumImageUrl
	String largeImageUrl
	String detailImageUrl
	String originalImageUrl
	String detailScreen
	String inventoryMessage
	Character requireInventory
	BigDecimal quantityIncluded
	BigDecimal piecesIncluded
	Character requireAmount
	BigDecimal fixedAmount
	BigDecimal weight
	BigDecimal productWeight
	BigDecimal productHeight
	BigDecimal shippingHeight
	BigDecimal productWidth
	BigDecimal shippingWidth
	BigDecimal productDepth
	BigDecimal shippingDepth
	BigDecimal productDiameter
	BigDecimal productRating
	Character returnable
	Character taxable
	Character chargeShipping
	Character autoCreateKeywords
	Character includeInPromotions
	Character isVirtual
	Character isVariant
	BigDecimal billOfMaterialLevel
	BigDecimal reservMaxPersons
	BigDecimal reserv2ndPPPerc
	BigDecimal reservNthPPPerc
	String configId
//	Date createdDate
//	Date lastModifiedDate
	Character inShippingBox
	String lotIdFilledIn
	Character orderDecimalQuantity
	UomType amountUomType
	Uom widthUom
	Enumeration requirementMethodEnum
	Uom quantityUom
	ProductCategory primaryProductCategory
	//Party manufacturerParty
	Uom heightUom
	Uom depthUom
	Uom diameterUom
	Enumeration ratingTypeEnum
	Uom weightUom
	Enumeration virtualVariantMethodEnum
	Geo origenGeo
	ProductType productType
	String     	tagCloud
	String      ticket
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 
	//static belongsTo = [Enumeration, Facility, Geo, Party, ProductCategory, ProductType,  Uom, UomType  ]

 

	static mapping = {
		id column: "product_id", generator: "assigned"
		detail type: 'text'
		version true
		
	}

	static constraints = {
		id maxSize: 36
		introductionDate nullable: true
		productType nullable: true
		releaseDate nullable: true
		supportDiscontinuationDate nullable: true
		salesDiscontinuationDate nullable: true
		salesDiscWhenNotAvail nullable: true, maxSize: 1
		internalName nullable: true
		brandName nullable: true, maxSize: 100
		comments nullable: true
		productName nullable: true, maxSize: 100
		description nullable: true
		detail nullable: true
		configId nullable: true
		priceDetailText nullable: true
		smallImageUrl nullable: true
		mediumImageUrl nullable: true
		largeImageUrl nullable: true
		detailImageUrl nullable: true
		originalImageUrl nullable: true
		detailScreen nullable: true
		depthUom nullable: true
		diameterUom nullable: true
		heightUom nullable: true
		ratingTypeEnum  nullable: true
		inventoryMessage nullable: true
		requireInventory nullable: true, maxSize: 1
		quantityIncluded nullable: true, scale: 6
		quantityUom nullable: true 
		piecesIncluded nullable: true
		requireAmount nullable: true, maxSize: 1
		fixedAmount nullable: true
		//facility nullable: true
		productDiameter  nullable: true
		productRating  nullable: true
		amountUomType  nullable: true
		weight nullable: true, scale: 6
		weightUom nullable: true, scale: 6
		productWeight nullable: true, scale: 6
		productHeight nullable: true, scale: 6
		shippingHeight nullable: true, scale: 6
		productWidth nullable: true, scale: 6
		shippingWidth nullable: true, scale: 6
		productDepth nullable: true, scale: 6
		shippingDepth nullable: true, scale: 6
		productDiameter nullable: true, scale: 6
		productRating nullable: true, scale: 6
		returnable nullable: true, maxSize: 1
		taxable nullable: true, maxSize: 1
		primaryProductCategory  nullable: true
		chargeShipping nullable: true, maxSize: 1
		autoCreateKeywords nullable: true, maxSize: 1
		includeInPromotions nullable: true, maxSize: 1
		isVirtual nullable: true, maxSize: 1
		isVariant nullable: true, maxSize: 1
		billOfMaterialLevel nullable: true
		reservMaxPersons nullable: true, scale: 6
		reserv2ndPPPerc nullable: true, scale: 6
		reservNthPPPerc nullable: true, scale: 6
		inShippingBox nullable: true, maxSize: 1
		lotIdFilledIn nullable: true
		orderDecimalQuantity nullable: true, maxSize: 1
		tagCloud  					nullable: true
		virtualVariantMethodEnum	nullable: true
		origenGeo 	nullable: true
		//manufacturerParty	nullable: true
		requirementMethodEnum 	nullable: true
		widthUom	nullable: true
		ticket  nullable: true , display:false
		state nullable: true , display:false
		userCreated nullable: true , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
		
		 
	}
}
