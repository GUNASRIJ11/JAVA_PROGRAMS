// /import java.util.*;
// import java.util.Scanner;
// // import java.util.io.*;

// class Pattern2 {

//     public static void main(String[] args) {

//         int [] a={2,3,6,5,8,7};
//         int [] b= new int[6];
//         int c=0;
//         for (int i = 0 ;i<a.length;i++){
//             if(a[i]%2==0){
//                 b[c]=a[i];
//                 c++;
//             }
//         }
//         for(int j=0;j<a.length;j++){
//             if(a[j]%2!=0){
//                 b[c]=a[j];
//                 c++;
//             }
//         }
//         System.out.println(Arrays.toString(b));

        
    

// }
// }

// -------------------------------------------------------------------------------------------------

// {1,8,7,34,90,89} ---> {1,7,9,90,89,34}

// import java.util.Arrays;

// class AscDsc{
//     public static void main(String[] args){
//         int [] a={1,8,7,34,90,89};
//         Arrays.sort(a);
//         int n=a.length;
//         for(int i=n/2;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int t=0;
//                 if(a[i]<a[j]){
//                     t=a[j];
//                     a[j]=a[i];
//                     a[i]=t;

//                 }
//             }

// }
// System.out.print(Arrays.toString(a));
//     }
// }

class Pattern2{
    public static void main(String[] args){
        int n=99;
        int r=2;
        int t=n;
        int d=0;
        while(t>0){
            d= t%10;
            d=d+t;

        }
        d=d*r;
        int s=d;
        int u=0;
        while(s>0){
            u=s%10;
            u=u+s;

        }
        System.out.println(u);
}
}