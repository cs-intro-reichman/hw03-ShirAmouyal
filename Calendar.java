/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {

        int yearToGet=Integer.parseInt(args[0]);
	 	while (year<yearToGet)
	    {
            if(dayOfWeek==1)
	 	  	System.out.println(dayOfMonth+"/"+month+"/"+year+"  Sunday");
            else{
            System.out.println(dayOfMonth+"/"+month+"/"+year);
            }
			
			advance();		
        }
		
	 	//// Write the necessary ending code here
	 }
	 private static void advance() {
		// Replace this comment with your code
	   
	  if(dayOfWeek==7){
		dayOfWeek=1;
		
	}
	else{
		dayOfWeek++;
	}
	  if(dayOfMonth<nDaysInMonth(month,year)){
		dayOfMonth++;
	} else {
		month++; dayOfMonth=1;
	}
	if (month > 12){
		month=1; year++;
	}


	}
      


	
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear;
		isLeapYear=((year % 400) == 0);
		isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeapYear;
		
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		boolean b1=isLeapYear(year);
		
		if(month==1) return 31;
		else if(month==2&&b1==true)return 29;
		else if(month==2&&b1==false) return 28;
		else if(month==3) return 31;
		else if(month==4) return 30;
		else if(month==5) return 31;
		else if(month==6) return 30;
		else if(month==7) return 31;
		else if(month==8) return 31;
		else if(month==9) return 30;
	   else if(month==10) return 31;
	   else if(month==11) return 30;
		else return 31;
	}
}