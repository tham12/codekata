import java.util.Scanner;

 class digit 
{
	private static Scanner sc;
	
	public static void main(String[] args)
	{
		int Num, Count=0;
		sc = new Scanner(System.in);		
		Num = sc.nextInt();
		while(Num > 0)
		{
			Num = Num / 10;
			Count = Count + 1; 
		}
		System.out.println("" + Count);
	}
}
