import java.util.*;
class Area
{

    int r;
    void setdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter circle radius : ");
        r = sc.nextInt();
    }
    void cal()
    {
        double ans;
        ans = 3.14 * r * r ;
        System.out.println("  Area of circle : "+ans);
    }

}

public class Circle {

    public static void main (String args[]){

        Area a1 =  new Area();
        a1.setdata();
        a1.cal();
    }

}
