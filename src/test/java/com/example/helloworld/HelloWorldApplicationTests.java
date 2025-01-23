package com.example.helloworld;

import com.example.helloworld.controller.HelloWorldController;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@QuarkusTest
class HelloWorldApplicationTests {

    @Inject
    private HelloWorldController helloWorldController;

    @Test
    void contextLoads() {
        assertNotNull(helloWorldController);
    }
}
