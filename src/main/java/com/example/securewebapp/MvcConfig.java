package com.example.securewebapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
	}

}

/*
 * The web application is based on Spring MVC. As a result, you need to
 * configure Spring MVC and set up view controllers to expose these templates.
 * The following listing (from
 * src/main/java/com/example/securingweb/MvcConfig.java) shows a class that
 * configures Spring MVC in the application:
 * 
 * 
 * The addViewControllers() method (which overrides the method of the same name
 * in WebMvcConfigurer) adds four view controllers. Two of the view controllers
 * reference the view whose name is home (defined in home.html), and another
 * references the view named hello (defined in hello.html). The fourth view
 * controller references another view named login. You will create that view in
 * the next section.
 */