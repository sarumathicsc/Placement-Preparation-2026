import java.util.*;

public class count_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int[] frequency = new int[256];

        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            frequency[ch]++;
        }

        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] > 0){
                System.out.println((char)i + ": " + frequency[i]);
            }
        }
        sc.close();
    }
}
