package ArrayWithDSA;

public class  rotate90degree {

    public static void rotate(int [][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < row; i++)
        {
            for(int j=col-1; j >=0;j--)
            {
               System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String [] args )
    {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
                };
        rotate90degree.rotate(arr);

    }
}
