import java.util.*;
import java.util.Scanner;

import java.lang.Math.*;
import java.util.io.*;

class Amstrong {

    static void Check_amstrong(int num) {
        int digits;
        int original_num = num;
        int sum = 0;
        int numOfDigits = String.valueOf(num).length();
        while (num > 0) {
            digits = num % 10;
            sum = sum + (int) Math.pow(digits, numOfDigits);
            num = num / 10;
        }

        if (sum == original_num)
            System.out.println("The number is amstrong");
        else
            System.out.println("The number is not amstrong");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Check_amstrong(n);

        sc.close();

    }

}
