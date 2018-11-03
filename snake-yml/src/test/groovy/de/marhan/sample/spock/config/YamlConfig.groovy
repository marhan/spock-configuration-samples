package de.marhan.sample.spock.config

class YamlConfig {

	Map<String, ServiceConfig> services

	Map<String, ServiceConfig> getServices() {
		return services
	}

	void setServices(Map<String, ServiceConfig> services) {
		this.services = services
	}
}
