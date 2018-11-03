package de.marhan.sample.spock.config

import org.yaml.snakeyaml.Yaml

class Configuration {

    Map<String, ServiceConfig> services

    static Configuration init() {
		String configFile = new File("src/test/resources/${System.getProperty("environment")}.yml").toURI().toURL().getText("UTF-8")
		new Yaml().loadAs(configFile, Configuration.class)
    }

}
