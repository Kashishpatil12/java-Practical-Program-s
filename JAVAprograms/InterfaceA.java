

     interface Tcit {
        
        public void name();
        public void Address();
    
    }
    
    class ABC implements Tcit{

            public void name(){

                System.out.println("kashish");
            }
            public void Address(){
                System.out.println("vastral");
            }

    }

class Interface {
public static void main(String args[]){

    System.out.println("Main Class");

    ABC A = new ABC();
    A.name();
    A.Address();


}


}
















