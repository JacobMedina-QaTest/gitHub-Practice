package com.github.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	
}
