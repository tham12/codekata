import java.util.Scanner;
class Alph
{
     public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
	 ch = scan.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + "  Alphabet");
        }
        else
        {
            System.out.print(ch + "  Alphabet");
        }
    }
}
