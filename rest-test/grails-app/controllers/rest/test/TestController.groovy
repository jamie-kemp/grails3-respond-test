package rest.test

import grails.rest.RestfulController

import groovy.util.logging.Slf4j
import org.springframework.transaction.annotation.Transactional

@Slf4j
class TestController extends RestfulController {

	static responseFormats = ['json']
	
	TestController() {
		super(Test)
	}
    def index() { }
	
	@Transactional
	def save() {
		def val = ["status": "ERROR", "reason": "Test", "detail": "test"]	
		respond(val, [status: 400]) //Works fine as respond([status: 400], val)
	}
}
