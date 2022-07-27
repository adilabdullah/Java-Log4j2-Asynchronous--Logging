package com.java.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
	   static {
	        System.setProperty("log4j.configurationFile", "D:\\Misc\\log4j2.xml");
	        /*Enabling async logging.*/
	        System.setProperty("log4j2.contextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
	   }
	public static void main(String[] args)
	{
	//	Logger logger =LogManager.getLogger(Logging.class.getName());
		printLog("File2","Adil Abdullah 11");
		}
	
	
	public static void printLog(String loger,String message)
	{
		Logger logger =LogManager.getLogger(loger);
		logger.info(message.trim());
	}
}
