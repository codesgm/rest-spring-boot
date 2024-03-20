package com.transaction.transaction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HealthController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/health")
    public Health health(

            @RequestParam(value = "name", defaultValue = "World") String name
    ) {
    return new Health(counter.incrementAndGet(), String.format(template, name));
    }
}
