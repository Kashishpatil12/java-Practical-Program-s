
import java.util.*;
public class Dayswitch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a day number");
        int day = sc.nextInt();

        switch (day) {
            case 1:     System.out.println("sun");
                        break;

            case 2:     System.out.println("mon");
                        break;

            case 3:     System.out.println("tue");
                         break;

            case 4:    System.out.println("wed");
                        break;
                            
            case 5:     System.out.println("thu");
                        break;
                        
            case 6 :    System.out.println("fri");
                        break;
                
            case 7 :  System.out.println("sat");
                        break;

    
          default: System.out.println("try again");
                break;
        }
    }
}
