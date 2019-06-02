package org.hackerandpainter.springbootstatemachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;
import org.hackerandpainter.springbootstatemachine.enums.Events;
import org.hackerandpainter.springbootstatemachine.enums.States;

@SpringBootApplication
public class SpringBootStatemachineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStatemachineApplication.class, args);
	}

	@Autowired
	private StateMachine<States, Events> stateMachine;

	@Override
	public void run(String... args) throws Exception {
		stateMachine.start();
		stateMachine.sendEvent(Events.PAY);
		stateMachine.sendEvent(Events.RECEIVE);
	}
}
