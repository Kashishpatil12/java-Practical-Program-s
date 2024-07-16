class Animal{

    Animal(){
        System.out.println("Animal is created.");
    }
}
class Dog extends Animal {
    
    Dog(){
   
        super();
        System.out.println("dog is created.");
        
    }
}
public class Superkeyword {
    public static void main(String args[]){

        Dog d = new Dog();
        
        

    }
}
