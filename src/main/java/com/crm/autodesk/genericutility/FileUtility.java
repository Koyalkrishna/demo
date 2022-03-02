package com.crm.autodesk.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author USER
 *
 */

public class FileUtility {
	/**
	 * its used to read the data from commonData.properties file based on key which you pass as an argument
	 * @param key
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String Key)throws Throwable{
		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(Key);
		return value;
	}

}
