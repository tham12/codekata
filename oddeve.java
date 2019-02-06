import java.io.*;
import java.util.Scanner; 
class oddeve
{
   public static void main(String args[])
   {
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		if(a>0)
		{
			if (a % 2 == 0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
			}
		else
		{
			System.out.println("Invalid");
		}
   }
}
