package com.profesys.scientiam.security.box

import com.profesys.scientiam.security.User

class SecurityBox {

	/*
	 * Tabla para guardar claves y valore encriptados
	 */
	String id
	Character hasTable
	String description
	SecurityBox parentBox
	String      box
	String      urlContent
	String      referenceContent
	String      securedContent
	 Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	 
	static mapping = {
		id column: "security_box_id", generator: "assigned"
		version true
		referenceContent   type: "text"
	}

	static constraints = {
		id maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		parentBox nullable: true
		box nullable: true
		urlContent nullable:true 
		referenceContent nullable:true, size:0..65535
		securedContent nullable:true 
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
