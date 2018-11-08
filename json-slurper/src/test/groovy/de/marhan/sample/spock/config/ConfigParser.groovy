package de.marhan.sample.spock.config

import groovy.json.JsonSlurper

class ConfigParser {

	static init() {
		def environment = System.getProperty("environment")
		def configFile = new File("src/test/resources/${environment}.json")
		new JsonSlurper().parseText(configFile.text)
	}
}
