public class Reverse 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int reverse = 0;
		while(num!=0)
		{
			reverse = reverse * 10;
			reverse = reverse + num%10;
			num = num/10;
		}
		System.out.println("Reverse of that number is " + reverse);
	}
}
