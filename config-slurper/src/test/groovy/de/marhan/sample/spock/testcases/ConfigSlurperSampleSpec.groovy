package de.marhan.sample.spock.testcases

import de.marhan.sample.spock.config.ConfigParser
import io.restassured.http.ContentType
import spock.lang.Specification

import static io.restassured.RestAssured.given

class ConfigSlurperSampleSpec extends Specification {

	ConfigObject configObject

	def setup() {
		configObject = ConfigParser.init()
	}

	def "public gateway reachable"() {
		expect:
		given().contentType(ContentType.URLENC)
			.when().get(configObject.services.google.url)
			.then().contentType(ContentType.HTML)
			.statusCode(200)
	}
}