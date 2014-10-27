package com.km.common.utils;


public class TimeUtil {
	static java.text.SimpleDateFormat dateTimeFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static java.text.SimpleDateFormat dateTimeNotSplitFormat = new java.text.SimpleDateFormat("yyyyMMddHHmmss");
	static java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
	static java.text.SimpleDateFormat timeFormat = new java.text.SimpleDateFormat("HH:mm:ss");
	
	public static String getNowDateTime() {
		java.util.Date today=new java.util.Date();   
		return dateTimeFormat.format(today);
	}
	
	public static String getNowDateTime4NotSplit() {
		java.util.Date today=new java.util.Date();   
		return dateTimeNotSplitFormat.format(today);
	}
	
	public static String getNowDate() {
		java.util.Date today=new java.util.Date();   
		return dateFormat.format(today);
	}
	
	public static long getUnixTime() {
		return (long)System.currentTimeMillis()/1000;
	}
	
	public static String fromUnixTime(int ctime) {
		java.util.Date today=new java.util.Date((long)ctime * 1000);   
		return dateTimeFormat.format(today);
	}
	
	public static String fromUnixTime(long ctime) {
		java.util.Date today=new java.util.Date(ctime * 1000);   
		return dateTimeFormat.format(today);
	}
	
	public static String fromUnixTime2Time(long ctime) {
		java.util.Date today=new java.util.Date(ctime * 1000);   
		return timeFormat.format(today);
	}
	public static String formatDuring(long mss) {  
	    long days = mss / (1000 * 60 * 60 * 24);  
	    long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);  
	    long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);  
	    long seconds = (mss % (1000 * 60)) / 1000; 
	    String output="";
	    if(days!=0)output+=days+":";
	    if(hours!=0)output+=hours+":";
	    else if(days!=0)output+=hours+":";
	    if(minutes!=0)output+=minutes+":";
	    else if(days!=0||hours!=0)output+=minutes+":";
	    if(seconds!=0)output+=seconds;
	    else if(days!=0||hours!=0||minutes!=0)output+=seconds;
	    return output;  
	} 
	
	public static void main(String[] args) {
		System.out.print(getNowDateTime());
	}
}
