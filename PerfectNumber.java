import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, N, Result = 0;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for (i = 1; i < N; i++) 
		{
			if (N % i == 0)
			{
				Result = Result + i;
			}
		}
		if (Result == N) 
		{
			System.out.format(+N + ": This is a Perfect Number");
		} 
		else
		{
			System.out.format(+N + ": This is NOT a Perfect Number");
		}

	}

}
