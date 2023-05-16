package com.example.testingweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GreetingServiceTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private GreetingService greetingService;

    @Test
    public void greetShouldReturnDefaultMessage() {
        GreetingService greetingService = new GreetingService();
        String greeting = greetingService.greet();
        assertThat(greeting).isEqualTo("Finaliza el curso DevOps Foundation v4 - Eduardo Avello");
    }
}

