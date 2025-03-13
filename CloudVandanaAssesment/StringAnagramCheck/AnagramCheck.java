// Write a Java program that takes two strings as input and checks if they are anagrams (containing the same characters in a different order).
// Example:
// Input: "listen", "silent" Output: true
// Input: "hello", "world" Output: false

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        
        if (str1.length() != str2.length()) {
            return false;
        }

        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        
        if (isAnagram(str1, str2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

        sc.close();
    }
}
