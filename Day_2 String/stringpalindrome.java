import java.util.*;

public class stringpalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        String s2 = "";

        //String s2 = StringBuilder(s1).reverse().toString();
        for(int i = s1.length()-1; i >= 0; i--){
            s2 += s1.charAt(i);
        }
        
        if(s1.equals(s2)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}