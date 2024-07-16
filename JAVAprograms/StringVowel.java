import java.util.*;



public class StringVowel{

    public static void main(String args[]){
        System.out.println("please enter name : ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int len = name.length();
        int count = 0;
        int charlen = 0; 
        for(int k=0 ; k<len ; k++){

            if(name.charAt(k) == 'a' || name.charAt(k) == 'e' || name.charAt(k) == 'i' || name.charAt(k) == 'o' || name.charAt(k) == 'u' );
            count++;
        }
        charlen += 1 ;
        System.out.println("total vowel is : " +count);
        System.out.println("total character is : " +charlen);
}


}



