import java.util.Scanner;
class VowCons
 {
  public static void main(String args[])
  {
     System.out.println("Enter a character :");
   	Scanner sc = new Scanner(System.in);
     char ch = sc.next().charAt(0);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
    {
        System.out.println("vowel");
  
	  }
else
      {
      if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
    {  
     System.out.println("consonant");
   }
else
{
System.out.println("default");
  }
}
}
}
