package de.marhan.sample.spock.config

import org.yaml.snakeyaml.Yaml

class Configuration {

    Map<String, ServiceConfig> services

    static Configuration init() {
        def yaml = new Yaml()
        def yamlDocument = this.getClass().getResource("/${System.getProperty("environment")}.yml").getText('UTF-8')
        yaml.loadAs(yamlDocument, Configuration.class)
    }

}
