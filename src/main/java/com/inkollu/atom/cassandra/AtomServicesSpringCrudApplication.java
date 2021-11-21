package com.inkollu.atom.cassandra;

import com.akash.atom.CassandraAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.inkollu.atom.cassandra", "com.akash.atom"})
public class AtomServicesSpringCrudApplication {
    @Autowired
    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        new CassandraAccess(applicationContext);
        SpringApplication.run(AtomServicesSpringCrudApplication.class, args);
    }

}
