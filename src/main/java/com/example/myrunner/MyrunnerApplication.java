package com.example.myrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ComputerProcessor;
import com.example.Doubler;
import com.example.Squarer;

@SpringBootApplication
public class MyrunnerApplication {

	public static void main(String[] args) {
		new ComputerProcessor()
		.addComputer(new Doubler())
		.addComputer(new Squarer())
		.computeAll(8);
			}

}
