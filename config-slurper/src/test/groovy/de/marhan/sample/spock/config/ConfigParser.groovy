package de.marhan.sample.spock.config

class ConfigParser {

	static ConfigObject init() {
		def environment = System.getProperty("environment")
		def configFile = new File("src/test/resources/EnvironmentConfig.groovy").toURI().toURL()
		new ConfigSlurper(environment).parse(configFile)
	}
}
