import java.util.Scanner;

public class Reverse1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = 0;
		int rev = 0;
		
		num = sc.nextInt();
		while(num!=0)
		{
			rev = rev * 10;
			rev = rev + num%10;
			num = num/10;
		}
		System.out.println("Reverse of that number is " + rev);
	}
}
