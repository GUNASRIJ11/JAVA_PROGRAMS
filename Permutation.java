import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Integer arr1[] = { 2, 4, 3 };
        int arr2[] = { 7, 8, 6 };
        int k = 10;
        int n = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
            for (int i = 0; i < n; i++)
            if ((arr1[i] + arr2[i]) < k)
                return "False";
            return True;
            if(true){
                System.out.println("yes");

            }else{
                System.out.println("no");
            }
        

    }

}
