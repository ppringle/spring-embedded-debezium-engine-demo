package io.cdc.spring_embedded_debezium_engine_demo;

import org.springframework.boot.SpringApplication;

public class TestSpringEmbeddedDebeziumEngineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringEmbeddedDebeziumEngineDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
