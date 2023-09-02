import java.util.*;

import java.util.io.*;

class Perfect {

    static void Check_Perfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;

            }
        }

        if (sum == num) {

            System.out.println("The number " + num + " is " + "a perfect number");
        } else
            System.out.println("The number " + num + " is " + " not a perfect number");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Check_Perfect(n);

        sc.close();

    }

}
