import java.util.Scanner;
class Resturant{
    
      public int starter(int amount)
      {
            int ch,price=0,soup=170,hbk=230,chat=160,tikki=150,qty;
            Scanner sc = new Scanner(System.in);
            System.out.println("1. soup :  170\n2. hbk :  200\n3. chat : 160\n4. tikki : 150");
            System.out.println("Select your choice");
            ch = sc.nextInt();
            switch(ch){

                case 1: price=170;
                        break;
                case 2: price=100;
                        break;
                case 3: price=160;
                        break;
                case 4: price=150;
                        break;
                default: System.out.println("Invalid choice");
            } 
            System.out.println("Enter Quntity");
            qty = sc.nextInt();
            price = price * qty;
            amount = amount + price;
            System.out.println("____________________________________");
            System.out.println("your current balance  : "+amount);
            System.out.println("_____________________________________");
            return amount;
      }  
    public int maincource(int amount){

        int quan , c,pannertikka=250, pannerhandi=245,paneertufani=240 ,pannerchilli=260, roti=45, buttermilk=20, p=0;
        Scanner  sc = new Scanner(System.in);

        System.out.println(".......................................................");
        System.out.println("----------------MAIN COURCE------------------");
        System.out.println(".......................................................");
        System.out.println("1. paneertikka  : 250[600gm]\n2. pannerhandi : 245[600gm]\n3. pannertufani : 240[600gm]\n4.  pannerchilli : 250[600gm] \n5. roti :45[1]\n6. buttermilk : 20[1]");
        System.out.println("7. paneertikka  : 190[400gm]\n8. pannerhandi : 180[400gm]\n9. pannertufani : 200[400gm]\n10. pannerchilli : 180[400gm]");
        
        System.out.println("enter your choice");
        c=sc.nextInt();
        switch(c){

                case 1: p = 350;
                break;
                case 2: p = 245;
                break;
                case 3: p = 240;
                break;
                case 4: p = 260;
                break;
                case 5: p = 45;
                break;
                case 6: p = 20;
                break;
                case 7: p = 190;
                break;
                case 8: p = 180;
                break;
                case 9: p = 200;
                break;
                case 10:p = 260;
                break;
                default: System.out.println("Inavalid input"); 
        }
        System.out.println("Enter quntity : ");
        quan = sc.nextInt();
        p = p*quan;
        amount = amount + p ;
        System.out.println("Your current balance : "+amount);
        return amount;

    }
    public int desert(int amount){

        int q,ice_cream=45,browine=50,lassi=30,pastry=40,d=0,cho;
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________________________________________");
        System.out.println("------------DESERT------------");
        System.out.println("______________________________________________________");
        System.out.println("1. ice-cream : 45\n2. browine : 50\n3. lassi : 30\n4. pastry : 40");
        System.out.println("enter your choice");
        cho=sc.nextInt();
        switch(cho){

                case 1: d=45;
                        break;
                case 2: d=50;
                        break;
                case 3: d=30;
                        break;
                case 4: d=40;
                        break;
                default:System.out.println("inavalid input");

        }
                        System.out.println("Enter quntity : "); 
                        q = sc.nextInt();
                        d = d * q;
                        amount = amount + d ;
                        System.out.println("your current balance : "+amount);
                        return amount;
        
    }
    
     public static void main(String args[]){

        int amount=0,total,choice=1, v=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("---------WELCOME OUR RESTURANT-----------");
        // System.out.println("Enter your balance");
        // amount = sc.nextInt();
        System.out.println("-----------STARTER-----------");
       
        Resturant r = new Resturant();
        while(choice==1){

            amount = r.starter(amount);
            amount = r.maincource(amount);
            amount = r.desert(amount);
            System.out.println("Do you want to order more item , press for yes or other exit");
            choice = sc.nextInt();
            System.out.println("Enter your choice\n1.starter\n2.miancourse\n3.desert");
            v=sc.nextInt();

            switch(v){

                case 1:amount = r.starter(amount);
                        break;
                case 2:amount = r.maincource(amount);
                        break;
                case 3:amount = r.desert(amount);
                        break;  
            }
        }
        System.out.println("..........THANKS FOR VISITING............");


    }

}