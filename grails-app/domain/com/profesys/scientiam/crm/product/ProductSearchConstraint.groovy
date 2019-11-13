package com.profesys.scientiam.crm.product

class ProductSearchConstraint  {
 
	String constraintSeqId
	String constraintName
	String infoString
	Character includeSubCategories
	Character isAnd
	Character anyPrefix
	Character anySuffix
	Character removeStems
	String lowValue
	String highValue
 
	ProductSearchResult productSearchResult

 

	static belongsTo = [ProductSearchResult]
 
	static constraints = {
		productSearchResult maxSize: 36
		constraintSeqId maxSize: 36
		constraintName nullable: true
		infoString nullable: true
		includeSubCategories nullable: true, maxSize: 1
		isAnd nullable: true, maxSize: 1
		anyPrefix nullable: true, maxSize: 1
		anySuffix nullable: true, maxSize: 1
		removeStems nullable: true, maxSize: 1
		lowValue nullable: true, maxSize: 60
		highValue nullable: true, maxSize: 60
 
	}
}
