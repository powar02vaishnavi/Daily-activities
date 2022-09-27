//IF: WAP to accept a no from user and display a square if no is divisible by 5.
import java.util.*;

class square{

	public static void main(String[] args)
	{
		System.out.println("Enter  number- "); 
		Scanner in = new Scanner(System.in); 
		int a= in.nextInt();  
		if (a % 5 == 0)
		{
			System.out.println("Square of "+a+" is "+(a*a));
		}
		else
		{
			// Print no if no is not divisible by 5
			System.out.println(+a+"is not divisible by 5");
		}
	}
}
