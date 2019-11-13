package com.profesys.scientiam.services.budget


import java.util.Date;
 
import com.profesys.scientiam.security.User;

class BudgetRevision   {

	String                id
	String revisionSeqId
	Date dateRevised
	Budget budget 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted


	static constraints = {
	 
		budget maxSize: 36
		revisionSeqId maxSize: 36
		dateRevised nullable: true
			state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
