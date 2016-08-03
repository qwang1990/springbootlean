package com.wang;

import com.wang.domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TemplaterestApplication implements CommandLineRunner{


	private static final Logger log = LoggerFactory.getLogger(TemplaterestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TemplaterestApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
}
