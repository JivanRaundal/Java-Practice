/* Calendar class :- This class is used to get current system date & time.

NOTE: Moths starts from 00(zero). i.e. January (00), February (01), ....... Hence in final result of get() method, add 1 to months
      MM => Months
	  mm => seconds
*/

import java.util.*;
import java.text.*;			//for SimpleDateFormat class

class Pro21_calendar
{
	public static void main(String args[])
	{
		Calendar cal = Calendar.getInstance();
		int day	     = cal.get(Calendar.DAY_OF_MONTH);
		int month    = cal.get(Calendar.MONTH);
		int year     = cal.get(Calendar.YEAR);
		
		System.out.println(day + "/" + (month+1) + "/" + year);		//(month+1) => BCZ, months here starts from 0 (zero) hence +1
		
		System.out.println("==================================");
		
		Calendar cld = Calendar.getInstance();
		Date d       = cld.getTime();				//returns a reference of object of type Date
		
		//For formatting date-
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		String mydate1 = sd.format(d);				//sd.format() will return a string containing your date
		System.out.println(mydate1);
		
		System.out.println("==================================");
		
		//OR Formatting
		SimpleDateFormat sd2 = new SimpleDateFormat("dd-MM-yyyy  hh::mm::ss");			//this will format Date & Time
		String mydate2 = sd2.format(d);
		System.out.println(mydate2);
	}
}