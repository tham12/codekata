import java.util.Scanner;
 class VowCons
 
{
  
 public static void main(String args[])
 
  {
     
   	Scanner sc = new Scanner(System.in);
     
	 char ch = sc.next().charAt(0);
     
 if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
    
 	 {
        
	 System.out.println("Vowel");
  
	  }
else
     
	 {

if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')

  {  
     System.out.println(" Consonant");
 
     }
else
{
System.out.println("Invalid");
 
  }

}
}
}
