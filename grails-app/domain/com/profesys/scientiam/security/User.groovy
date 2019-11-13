package com.profesys.scientiam.security

class User {

	transient springSecurityService

	
	String   id
	String username
	String password
	String prefix
	Role role
	String nombreCompleto
	String printerPath
	boolean enabled = true
	
 
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static constraints = {
		id (  unique:true )
		username ( blank:false, size:5..15,matches:/[\S]+/, unique:true)
		password (blank: false, password: true )
		nombreCompleto (blank:false, size:5..80)
		username blank: false, unique: true
		password blank: false
		prefix maxSize: 5,nullable: false  , display:true
	}

 

	static mapping = {
		id          column: 'id', generator: 'assigned'
		version true
		password column: '`password`'

	}

//	Set<Role> getAuthorities() {
//		UserRole.findAllByUser(this).collect { it.role } as Set
//	}

	def beforeInsert() {
//		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
//			encodePassword()
		}
	}

	protected void encodePassword() {
//		password = springSecurityService.encodePassword(password)
	}
	
	String toString(){
		return "${username}"
		}
}
