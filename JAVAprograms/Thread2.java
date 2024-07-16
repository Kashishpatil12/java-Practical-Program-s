class Hello{
    
    public void execute(){
        for(int i=0; i<10 ; i++){
            System.out.println(" Print2 = HI " +i);
        }

    }

}
public class Thread2 {
    public static void main(String args[]){

        Hello  H = new Hello();
        H.execute();
        
        System.out.println("----- Start -----");
        for(int i=0 ; i<10 ; i++){
            System.out.println(" Print1 = Hello " +i);
        }
        System.out.println("----- End -----");
    }
}







