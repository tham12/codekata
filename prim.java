import java.util.Scanner; 
public prim
{ 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int a, b, i, j, flag; 
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        System.out.printf("", a, b); 
  
        
        for (i = a; i <= b; i++)
        { 

            if (i == 1) 
            { 
                continue; 
            }
            
            flag = 1; 
  
            for (j = 2; j <= i / 2; ++j)
            { 
                if (i % j == 0) 
                { 
                    flag = 0; 
                    break; 
                } 
            } 
  
            if (flag == 1)
            { 
             System.out.println(i);  
            } 
