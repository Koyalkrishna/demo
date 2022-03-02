package com.crm.autodesk.genericutility;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author USER
 *
 */

public class JavaUtility {
	/**
	 * its used to generate random number
	 * @return int data
	 */
	public int getRandomNumber() {
		Random random = new Random();
		int intRandom = random.nextInt(1000);
		return intRandom;
	}
	/**
	 * used to get system date & time in IST format
	 * @return
	 */
	public String getSystemDateAndTime() {
		Date date = new Date();
		String dateAndTime = date.toString();
		
		String YYYY = dateAndTime.split(" ")[5];
		String DD = dateAndTime.split(" ")[2];
		int MM = date.getMonth()+1;
		
		String finalFormate = YYYY+"-"+MM+"-"+DD;
		return finalFormate;
	}
}


