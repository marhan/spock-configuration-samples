package de.marhan.sample.spock.config

class ConfigParser {

	static ConfigObject init() {
		new ConfigSlurper(System.getProperty("environment")).parse(new File("src/test/resources/EnvironmentConfig.groovy").toURI().toURL())
	}
}
