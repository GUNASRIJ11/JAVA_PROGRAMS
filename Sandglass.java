
import java.util.Scanner;

public class Sandglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}

// import java.util.Scanner;

// public class Sandglass {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter number: ");
// int n = sc.nextInt();

// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// for (int k = i; k <= n; k++) {

// if (i == 1)
// System.out.print(k + " ");
// }
// System.out.println();
// }

// for (int i = n - 1; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// for (int k = i; k <= n; k++) {
// System.out.print(k + " ");
// }
// System.out.println();
// }
// sc.close();

// }
// }
