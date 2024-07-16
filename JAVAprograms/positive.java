import java.util.*;
public class positive {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int [] a = new int[10];
        int i ; 
        int positive=0 ;
        int nagative=0 ;
        int equal=0;

        System.out.println("enter elements : ");
        for(i=0 ; i<10 ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0 ; i<10 ; i++)
        {
            if(a[i]>0){
                positive++;
            }
            else if (a[i]==0){
                equal++;
            }
            else
            {
                nagative++;
            }
        }
        System.out.println("positive numbers "+a[i]);
        System.out.println("equal numbers "+a[i]);
        System.out.println("nagative numbers"+a[i]);


    }
}
