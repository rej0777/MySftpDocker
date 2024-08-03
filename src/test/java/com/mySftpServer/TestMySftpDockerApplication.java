package com.mySftpServer;

import org.springframework.boot.SpringApplication;

public class TestMySftpDockerApplication {

	public static void main(String[] args) {
		SpringApplication.from(MySftpDockerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
