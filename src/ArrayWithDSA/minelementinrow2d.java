package ArrayWithDSA;

public class minelementinrow2d
{
        static void find(int[][] arr) {

            int m = arr.length;
            int n = arr[0].length;

            int result = Integer.MAX_VALUE;  // final minimum

            for (int i = 0; i < m; i++) {

                int rowMax = arr[0][0];   // current row ka max

                for (int j = 1; j < n; j++) {
                    if (arr[i][j] > rowMax) {
                        rowMax = arr[i][j];
                    }
                }

                // sabhi rows ke max me se minimum
                if (rowMax < result) {
                    result = rowMax;
                }
            }

            System.out.println("Minimum of all row maximums = " + result);
        }

        public static void main(String[] args) {

            int[][] arr = {
                    {2, 2, 3, 4, 7},
                    {7, 8, 1, 6, 3},
                    {5, 5, 4, 1, 4},
                    {3, 1, 8, 2, 6}
            };

            find(arr);
        }


}




