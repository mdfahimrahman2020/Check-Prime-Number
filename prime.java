import java.util.Scanner;
public class prime
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n\t\"CHECK PRIME NUMBER\"");
		Scanner input =new Scanner (System.in);
		int x, count = 0;

		System.out.println("\n\nEnter a number : ");
		x = input.nextInt();

		for(int i = 2; i<x; i++)
		{
			if(x % i ==0)
			{
				count++;
				break;
			}
		}
		System.out.println();
		if(count == 0)
		{
			System.out.print(x+ " is a prime number");
		}
		else
		{
			System.out.print(x+" is not a prime number");
		}


	}
}