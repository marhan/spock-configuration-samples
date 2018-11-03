package de.marhan.sample.spock.config

environments {
	dev {
		services.google.url = "https://google.com"
	}
	preview {
		services.google.url = "https://google.com"
	}
	live {
		services.google.url = "https://google.com"
	}
}