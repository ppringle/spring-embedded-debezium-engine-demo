package io.cdc.spring_embedded_debezium_engine_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringEmbeddedDebeziumEngineDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
