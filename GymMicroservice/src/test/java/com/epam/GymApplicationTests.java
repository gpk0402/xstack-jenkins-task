package com.epam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GymApplicationTests.class)
@EnableAutoConfiguration(exclude = {KafkaAutoConfiguration.class, DataSourceAutoConfiguration.class})
class GymApplicationTests {

    @Test
    void contextLoads() {
    }

}
