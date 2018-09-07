import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first integer here: ");
		int num = input.nextInt();
		System.out.println("Enter your second integer here: ");
		int num2 = input.nextInt();
		TwoIntegers twointegers = new TwoIntegers(num, num2);
		String arithmatic = twointegers.arithmatic();
		System.out.println(arithmatic);
		System.out.println("This is the largest number: " + twointegers.larger()
		+ " The sum of these numbers is even: " + twointegers.even() + " and " + num +
		" is a multiple of " + num2 + ":" + twointegers.multiple());
		
	}
}
