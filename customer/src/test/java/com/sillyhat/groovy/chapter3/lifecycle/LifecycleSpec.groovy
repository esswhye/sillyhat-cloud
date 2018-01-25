package com.sillyhat.groovy.chapter3.lifecycle

class LifecycleSpec extends spock.lang.Specification{

	def setupSpec() {
		println "Will run only once"
	}     
	
	def setup() {
		println "Will run before EACH feature"
	}         
	
	def "first feature being tested"() {
		expect: "trivial test"
		println "first feature runs"
		2 == 1 +1 
	}

	def "second feature being tested"() {
		expect: "trivial test"
		println "second feature runs"
		5 == 3 +2 
	}
	
	
	def cleanup() {
		println "Will run once after EACH feature"
	}        
	
	def cleanupSpec() {
		println "Will run once at the end"
	}   

	
}

