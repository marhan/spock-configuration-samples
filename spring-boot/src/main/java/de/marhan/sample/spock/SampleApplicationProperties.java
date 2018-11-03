package de.marhan.sample.spock;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("services")
public class SampleApplicationProperties {

	private Map<String, String> google;

	public Map<String, String> getGoogle() {
		return google;
	}

	public void setGoogle(Map<String, String> google) {
		this.google = google;
	}


}
