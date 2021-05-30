package JUnit;
import java.util.*;
public class CalculateTemp {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Your Choice 1.Celsius or 2.Fahrenheit");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				
				System.out.println("Enter the temperature in Fahrenheit:");
				int fahrenheit = sc.nextInt();
				int celsius = (fahrenheit - 32 ) * 5 / 9;
				System.out.println("The temperature in Celsius is :" + celsius);
				break;
				
			case 2:
				
				System.out.println("Enter the temperature in Celsius:");
				int cel = sc.nextInt();
				int fah = ( cel * 9 / 5 ) + 32 ;
				System.out.println("The temperature in Fahrenheit is :" + fah);
				break;
				
		}
		
	}
}
