package dateNtimeApi;
import java.util.*;
public class dateNtime1 {

	public static void main(String[] args) {

		/*
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
		//System.out.println(Long.MAX_VALUE/1000/60/60/24/365);
		//DATE CLASS
		Date d=new Date("9/3/2023");
		System.out.println(d.getYear()+1900);
        */
		GregorianCalendar gc= new GregorianCalendar();
		System.out.println(gc.isLeapYear(1700));
		System.out.println(gc.isLeapYear(2020));
		System.out.println(gc.get(Calendar.MONTH));
		
		TimeZone tz=gc.getTimeZone();
		System.out.println(tz.getID());
		System.out.println(tz.getDisplayName());
		gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tzz=gc.getTimeZone();
		System.out.println(tzz.getID());
		System.out.println(tzz.getDisplayName());
		}

}
