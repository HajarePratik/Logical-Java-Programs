package JUnit;
import java.util.*;
public class PaymentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Principal Amount,Rate and Years");
		double Amount = sc.nextDouble();
		double Rate = sc.nextDouble();
		double Year = sc.nextDouble();
		
		double n = 12 * Year;
		double r = Rate / ( 12 * 100 );
		
		double MonthPayment = (Amount * r )/ (1 - (Math.pow((1+r), (-n)) )); 
		System.out.println(" The Payment Per Month is : " + MonthPayment);
	}

}
