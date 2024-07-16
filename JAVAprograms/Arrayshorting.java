import java.util.*;

public class Arrayshorting {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int i,j,temp;
        int []a = new int[5];

        System.out.println("enter values : ");
        for(i=0 ; i<5 ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(j=0 ; j<5 ; j++)
        {
            for(i=0 ; i<4 ; i++)
            {
                if(a[i]>a[i+1])
                {
                    temp = a[i];
                    a[i]=a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        System.out.println("accending order : ");
        for(i=0 ; i<5 ; i++)
        {
            System.out.println(a[i]);

        }
        System.out.println("");

    }
}
