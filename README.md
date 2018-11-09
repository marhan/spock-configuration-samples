Spock configuration samples
===============================

This project is a sample for different configuration variants, which can be used in a projects tested with Spock.

Configuration variants
---------------------

* [Groovy config class](config-class) (Custom Groovy object)
* [Groovy config slurper](config-slurper) (Groovy config DSL parser)
* [Groovy JSON slurper](json-slurper) (JSON config parser)
* [snakeyml](snake-yml) (YAML config file parser)
* [Spring Boot (Sidecar)](spring-boot) (Spring Boot based YAML config file parser with Dependency Injection)

Requirements
-------------
- JDK 1.8

Run tests with Gradle
--------------------

    ./gradlew clean test -Penvironment=dev
    
Supported environments: dev, preview, live

Build servers
-------------

* [Travis CI](https://travis-ci.org/marhan/spock-configuration-samples) (JDK10, JDK8)
* [Circle CI](https://circleci.com/gh/marhan/spock-configuration-samples) (JDK8)

Presentation
------------

* [Speaker Deck](https://speakerdeck.com/markushanses/spock-configuration-variants)

Further Resources
-----------------

* [Gradle homepage](http://www.gradle.org)
* [Spock homepage](http://spockframework.org)
* [snakeyaml homepage](https://bitbucket.org/asomov/snakeyaml/overview)
* [Rest-assured](http://rest-assured.io/)
* [Spring Boot](https://spring.io/projects/spring-boot)


Contact
-----------------
* [Markus Hanses](mailto:me@markushanses.de)
