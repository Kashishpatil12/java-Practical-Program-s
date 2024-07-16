public class Objarray {
    public static void main(String args[]){

        Account obj[] = new Account[3];
        
        
        obj[0] = new Account();
        obj[0].setdata(1, "kashish ");
        System.out.println(  " For Array Element 0 ");
        obj[0].showdata();
        System.out.println();
        
        obj[1] = new Account ();
        obj[1].setdata(2, "kanan ");
        System.out.println(" for array element 1 ");
        obj[1].showdata();
        System.out.println();
        
        obj[2] =  new Account();
        obj[2].setdata(3, " kalpana ");
        System.out.println(" for array element 2 ");
        obj[2].showdata();
    }
}
    class Account{
        int id ;
        String name;

        public void setdata(int c ,String d)
        {
            id = c;
            name = d;
        }
        public void showdata()
        {
            System.out.println(" value of id  = "+id);
            System.out.println("value of String = "+name);
        }

    }

