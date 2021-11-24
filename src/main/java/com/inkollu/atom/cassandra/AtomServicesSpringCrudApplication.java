package com.inkollu.atom.cassandra;

import com.akash.atom.CassandraAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.inkollu.atom.cassandra"})
//@ComponentScan(basePackages = {"com.inkollu.atom.cassandra", "com.akash.atom"})
public class AtomServicesSpringCrudApplication implements CommandLineRunner {
    @Autowired
    public ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(AtomServicesSpringCrudApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        new CassandraAccess(applicationContext);
    }
}
