package com.banking.app.main.util;

import org.apache.log4j.Logger;

import com.banking.app.main.BankingMain;

public class MainUtilities {
	
	public static Logger log = Logger.getLogger(MainUtilities.class);
	
	public static void mainMenu() {
		log.info("\n");
		log.info("Please choose from the following menu:");
		log.info("======================================");
		log.info("(1) New Customer?");
		log.info("(2) Customer Log-in");
		log.info("(3) Employee Log-in");
		log.info("(4) Exit");
		log.info("======================================");
		log.info("Please be sure to enter an appropriate number between 1 and 4.\n");
	}
	
	public static void customerMenu() {
		log.info("\n");
		log.info("Please choose from the following menu:");
		log.info("======================================");
		log.info("(1) Would you like to open a new account?");
		log.info("(2) Open an existing account?");
		log.info("(3) Exit");
		log.info("======================================");
		log.info("Please be sure to enter an appropriate number between 1 and 3.\n");
	}
}
