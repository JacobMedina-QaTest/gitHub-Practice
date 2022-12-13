package com.github.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.reporters.jq.Main;

import static org.testng.Assert.assertEquals;

public class SandBoxClass {

	public static final Logger log = LogManager.getLogger(SandBoxClass.class);
	
	// This is a custom wait class
	public void customWait(double inSeconds) {
		try {
			long seconds = (long) (inSeconds * 1000);
			Thread.sleep(seconds);
		} catch (Exception e) {
			log.error("Error: ", e);
			assertEquals(true, false);
		}

	}
	
	// This is a for-loop
	public static void doLoop() {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Count 1 thru 10");
		doLoop();
		
	}
	
}
