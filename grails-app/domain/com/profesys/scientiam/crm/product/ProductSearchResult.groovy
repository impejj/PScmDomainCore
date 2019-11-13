package com.profesys.scientiam.crm.product

class ProductSearchResult {

	String id
	String orderByName
	Character isAscending
	BigDecimal numResults
	Double secondsTotal
	Date searchDate
 
//	Visit visit

	static hasMany = [productSearchConstraints: ProductSearchConstraint]
//	static belongsTo = [Visit]

	static mapping = {
		id column: "product_search_result_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		orderByName nullable: true
		isAscending nullable: true, maxSize: 1
		numResults nullable: true
		secondsTotal nullable: true
		searchDate nullable: true
	 
	}
}
