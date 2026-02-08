package ArrayWithDSA;

public class rowsum {

    static void  row(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;
        int max = 0;
        int row = -1;
        for (int i = 0; i < m; i++) {
            int sum = 0;   // reset for each row

            for (int j = 0; j < n; j++) {
                sum = sum + arr[i][j];
            }

            if (sum > max) {
                max = sum;
                row = i+1;

            }
        }
        System.out.println("maximum is = "+ max + "row is = "+row);
    }

    public static void main(String[] args) {

        int[][] arr = {
                {2, 2, 3, 4, 7},
                {7, 8, 1, 6, 3},
                {5, 5, 4, 1, 4},
                {3, 1, 8, 2, 6}
        };

        rowsum.row(arr);
      //  System.out.println(result);
    }
}
