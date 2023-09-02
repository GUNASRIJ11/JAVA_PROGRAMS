import java.util.*;
import java.util.Scanner;

import java.lang.Math.*;
// import java.util.io.*;

class Factorial {

    static int fact(int num) {
        int factorial = 1;

        if (num==0)
        System.out.println(1);
        if (num==1)
        System.out.println(1);
        for(int i=1;i<=num;i++){
            factorial*=i;


        }
        return factorial;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res= fact(n);
        System.out.println((res));

        sc.close();

    }

}
