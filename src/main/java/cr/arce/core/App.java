package cr.arce.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/** 
 * <H1>App - Run SpringBootApplication</H1>
 * 
 * Start AzD-Core [ArcezD]
 * 
 * @author Diego Arce E.
 * @version 1.0
 * 
 * Copyright 2016 ArcezD.
 * 
 **/

@SpringBootApplication
//@EnableJpaAuditing(auditorAwareRef = "springSecurityAuditorAware")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    
}
