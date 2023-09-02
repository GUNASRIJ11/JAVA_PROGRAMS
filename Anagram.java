import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.io.*;

class Anagram {

    static boolean Check_anagram(String str1, String str2) {
        boolean result = false;

        if (str1.length() == str2.length()) {

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            result = Arrays.equals(arr1, arr2);
        }

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean anagram = Check_anagram(str1, str2);

        if (anagram) {
            System.out.println("The given words are anagram");
        } else {
            System.out.println("The given words are not anagram");

        }

        sc.close();

    }

}
