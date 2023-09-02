// import java.util.Arrays;
// import java.util.Collections;

// class Matrix {
//     static int MAX_SIZE = 10;

//     static void sortByRow(Integer mat[][], int n,
//             boolean ascending) {
//         for (int i = 0; i < n; i++) {
//             if (ascending)
//                 Arrays.sort(mat[i]);
//             else
//                 Arrays.sort(mat[i], Collections.reverseOrder());
//         }
//     }

//     static void transpose(Integer mat[][], int n) {
//         for (int i = 0; i < n; i++)
//             for (int j = i + 1; j < n; j++) {
//                 int temp = mat[i][j];
//                 mat[i][j] = mat[j][i];
//                 mat[j][i] = temp;
//             }
//     }

//     static void sortMatRowAndColWise(Integer mat[][],
//             int n) {
//         sortByRow(mat, n, true);
//         transpose(mat, n);
//         sortByRow(mat, n, false);

//         transpose(mat, n);
//     }

//     static void printMat(Integer mat[][], int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++)
//                 System.out.print(mat[i][j] + " ");
//             System.out.println();
//         }
