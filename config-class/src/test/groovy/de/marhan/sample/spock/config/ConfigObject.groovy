package de.marhan.sample.spock.config

class ConfigObject {

	public String environment

	def static init() {
		new ConfigObject(environment: System.getProperty('environment'))
	}

	def services() {
		serviceDefinitions().get(environment)
	}

	static def serviceDefinitions() {
		[
			"dev"    : ["google.url": "https://google.com"],
			"preview": ["google.url": "https://google.com"],
			"live"   : ["google.url": "https://google.com"]
		]
	}


}
