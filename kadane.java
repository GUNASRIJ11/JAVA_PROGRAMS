import java.util.*;
// import java.util.Scanner;
// import java.lang.Math.*;


class kadane {

    static int MaxsumSubarray(int arr[]) {

        int curr_sum = arr[0];
        int max_sum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {

            curr_sum = Math.max(arr[i], arr[i] + curr_sum);
            max_sum = Math.max(max_sum, curr_sum);

        }
        return max_sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxi_sum = MaxsumSubarray(arr);
        System.out.println("The maximum sum is " + maxi_sum);
        sc.close();

    }

}
