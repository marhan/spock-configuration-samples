package de.marhan.sample.spock.testcases

import de.marhan.sample.spock.SampleApplicationProperties
import io.restassured.http.ContentType
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

import static io.restassured.RestAssured.given

@SpringBootTest
class SpringBootSampleSpec extends Specification {

	@Autowired
	SampleApplicationProperties properties

	def "public gateway reachable"() {
		expect:
		given().contentType(ContentType.URLENC)
			.when().get(properties.getGoogle().get("url"))
			.then().contentType(ContentType.HTML)
			.statusCode(200)
	}
}