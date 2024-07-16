import java.util.*;
public class Gamecard {
     public int amount (int Totalamt){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your remaing amount : ");
        int amt = sc.nextInt();
        amt = amt + Totalamt ;
        System.out.println("your new game amount is  : " +amt);
        return amt;
     }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Gamecard g = new Gamecard();
        int option,Totalamt = 1000 , con;
        
        System.out.println("Choose one game : \n1. Ludo Game  = 400 \n2. Snake  Price = 550 \n3. Tennis  Price = 600 \n4. CarRace Price = 800 \n5. Jumping Price = 1100   ");
        option = sc.nextInt();

        do{
            switch (option) {
                
                case 1 :    System.out.println("------- LUDO -------" );

                    if(400 < Totalamt){

                        System.out.println("Now you can play this game");
                        Totalamt = Totalamt - 400;
                     
                        System.out.println(" * your total amount is  : " +Totalamt);
                        

                    }
                    else {
                        System.out.println("Please upadate your amt and than you can play this game");
                        g.amount(Totalamt);
                    }
                    break;
            case 2 : System.out.println(" ----- SNAKE GAME --------");

                if(550 < Totalamt)
                {
                    System.out.println("Now you can play this game");
                    Totalamt = Totalamt - 550;
                    
                    System.out.println("Your total amount is  : " +Totalamt);
                }
                else{
                    System.out.println("Plese uapdate your amt and than you can play this game");
                    g.amount(Totalamt);
                }
                break;

            case 3 : System.out.println(" ---- TENNIS ----"); 
                
                    if(600 < Totalamt)
                    {
                        System.out.println("Now you can play this game");
                        Totalamt = Totalamt - 600;
                       
                        System.out.println("Your total amount is : " +Totalamt);
                       
                    }
                    else{
                        System.out.println("please update your amt and than you can play this game");
                        g.amount(Totalamt);
                    }
                     break;  

            case 4 : System.out.println("----- Car RACE -----");

                    if(800 < Totalamt){

                        System.out.println("Now you can play this game");
                        Totalamt = Totalamt - 800 ;
                       
                        System.out.println("Your total amount is  : " +Totalamt);
                    }
                    else {
                        System.out.println("please update your amt and than you can play this game");
                        g.amount(Totalamt);
                    }
                    break;
                
            case 5 : System.out.println(" ------- JUMPING -------");

                    if(1100 < Totalamt){
                        System.out.println("Now you can play this game");
                        Totalamt = Totalamt - 1100;
                        
                        System.out.println("Your total amount is  : " +Totalamt);
                    }
                    else{
                        System.out.println("please update your amt and than you can play this game");
                        g.amount(Totalamt);
                    }
               
                    break; 
                    
            default : System.out.println("--- Invalid Input ---");
                     break;

                }
                System.out.println(" ---- Do you want to countinue your game ? if Yes then Press  1 or if No then press 0 -----");
                con = sc.nextInt() ; 
            }while(con ==  1);
            

            
            


    }
}
