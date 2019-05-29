package com.newag.www.newag;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.newag.www.newag",
        "com.newag.www.db"})
public class NewagApplication extends org.springframework.boot.web.support.SpringBootServletInitializer {

	public static void main(String[] args) {
		new NewagApplication()
			.configure(new SpringApplicationBuilder(NewagApplication.class))
			.run(args);

	}

}
