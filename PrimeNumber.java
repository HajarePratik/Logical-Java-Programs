import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,temp=1;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n == 1)
		{
			System.out.println("\n Number is Prime :");
		}
		else
		{
			for(i=2;i<n;i++)
			{
				if(n % i == 0)
				{
					temp = 0;
					break;
				}
			}
		}
		if(temp == 1)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is Not Prime");
		}

	}

}
