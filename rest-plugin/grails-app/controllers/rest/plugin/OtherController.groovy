package rest.plugin

import grails.rest.RestfulController

import groovy.util.logging.Slf4j
import org.springframework.transaction.annotation.Transactional

@Slf4j
class OtherController extends RestfulController {

	static responseFormats = ['json']
	
	OtherController() {
		super(Other)
	}
    def index() { }
	
	@Transactional
	def save() {
		def val = ["status": "ERROR", "reason": "Exception Handled", "detail": "test"]
			
		respond([status: 400], val) //Demonstration of it working fine, fails as respond(val, [status: 400])
	}
}
