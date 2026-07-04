import java.util.*;

public class anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
        } else {

            char[] array1 = s1.toCharArray();
            char[] array2 = s2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean isAnagram = Arrays.equals(array1, array2);

            System.out.println("Are Anagrams? " + isAnagram);
        }

        sc.close();
    }
}