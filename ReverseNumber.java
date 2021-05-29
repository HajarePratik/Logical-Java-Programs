import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, reversed = 0;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

	    while(num != 0)
	    {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }
	    System.out.println("Reversed Number: " + reversed);

	}

}
