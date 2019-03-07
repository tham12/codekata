 import java.util.*;
 
class pos
{
    public static void main(String []s)
    {
        int num;
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         
        if(num>0)
            System.out.println("positive");
        else if(num<0)
            System.out.println("negative");
        else
            System.out.println("zero");
         
    }
}
