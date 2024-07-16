import java.util.*;
public class Funsum{
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int a,b,ans;

    System.out.println(" Enter a : "); 
    a = sc.nextInt();
    System.out.println(" Enter b : ");
    b = sc.nextInt();
        
    ans = sum(a,b);
    System.out.println(" sum ans : "+ans);
    ans = mul(a,b);
    System.out.println(" mul ans : "+ans);
    ans = sup(a,b);
    System.out.println("sup ans : "+ans);
    ans = div(a,b);
    System.out.println(" div ans : "+ans);

    
}
public static int sum(int x , int y)
{
    return x + y;

}
 public static  int mul(int p , int q)
{  
    return p * q;
}   
public static int sup(int i , int j )
{    
   return i - j ;
}
public static int div(int c , int d)
{   
     return c / d;
}
    

   
   

}
    
        
        

       
       
    



