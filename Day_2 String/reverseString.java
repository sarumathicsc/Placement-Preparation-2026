import java.util.*;

public class reverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        String s2 = "";

        //String s2 = StringBuilder(s1).reverse().toString();
        for(int i = s1.length()-1; i >= 0; i--){
            s2 += s1.charAt(i);
        }
        System.out.println("The reversed string "+s2);
    }
}