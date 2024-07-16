public class Superkeywird {
    public static void main(String args[]){

        subclass obj = new subclass();
        obj.printmsg();
    }
}

class parantclass
{

    void display()
    {
        System.out.println("parent class method");
    }

}
class subclass extends parantclass
{
     void display()
     {
        System.out.println("child  class method");
     }

     void printmsg()
     {
         display();
         super.display();
    }
} 