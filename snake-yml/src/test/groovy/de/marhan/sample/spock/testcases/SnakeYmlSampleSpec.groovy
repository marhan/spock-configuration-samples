package de.marhan.sample.spock.testcases


import de.marhan.sample.spock.config.Configuration
import de.marhan.sample.spock.config.ServiceConfig
import io.restassured.http.ContentType
import spock.lang.Specification

import static io.restassured.RestAssured.given

class SnakeYmlSampleSpec extends Specification {

	Configuration configuration
	ServiceConfig serviceConfig

	def setup() {
		configuration = Configuration.init()
		serviceConfig = configuration.services.get("google")
	}

	def "public gateway reachable"() {
		expect:
		given().contentType(ContentType.URLENC)
			.when().get(serviceConfig.url)
			.then().contentType(ContentType.HTML)
			.statusCode(200)
	}
}