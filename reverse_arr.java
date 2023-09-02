import java.util.*;

public class reverse_arr {
    public static void main(String args[]) {
        int[] arr = { 2, 3, 6, 4, 8, 5, 9 };
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println(arr);
        for (int i = 0; i < n - 1; i++) {
            {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i-1] = temp;
            }
        }

        System.out.println(arr);

    },..,,.....,,.,.,.,
}