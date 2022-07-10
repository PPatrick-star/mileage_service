package com.triple;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import static org.springframework.core.env.AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME;


@Slf4j
@SpringBootApplication
public class TripleApplication {

    private static void main(String[] args){

        SpringApplication.run(TripleApplication.class, args);
    }

}
