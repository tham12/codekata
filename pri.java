import java.util.*;
class Pr3 
{
public static void main(String args[]) {
int num=0;
int prime=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
if(num%2==0 && num>=2)
{
prime=0;

}
else
{
prime=1;
}
if(prime==0)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
