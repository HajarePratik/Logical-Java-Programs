package JUnit;
import java.util.*;
public class DayofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Day,Month,Year ;
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter a Date");
			Day = sc.nextInt();
			System.out.println("Enter a Month");
			Month =sc.nextInt();
			System.out.println("Enter a Year");
			Year = sc.nextInt();
		}
		int y = Year - (14 - Month ) / 12 ;
		int x = y + (y/4) - (y/100) + (y/400);
		int m = Month + 12 * ((14 - Month)/12) - 2;
		int d = (Day + x + (31* m )/12 ) % 7;
		
		String DaysArray [] =  {"Sunday " ,"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };
		System.out.println(DaysArray[d]);

	}

}
