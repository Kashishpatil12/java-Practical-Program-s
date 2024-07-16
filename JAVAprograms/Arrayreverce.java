import java.util.*;
public class Arrayreverce {
    public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);

        int []a = new int[5];
        int i;

        System.out.println("enter values : ");
        for(i = 0 ; i<5 ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("array reverce : ");
        for(i=4 ; i>=0 ; i--)
        {
            System.out.println(a[i]);
        }
        


    }
}
