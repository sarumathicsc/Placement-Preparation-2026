import java.util.*;

public class count_vowels_consonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int vowels = 0;
        int consonants = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Count of vowels : "+vowels);
        System.out.println("Count of consonants : "+consonants);

        sc.close();
    }
}
