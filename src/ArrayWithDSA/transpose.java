package ArrayWithDSA;

public class transpose {

    public static void main(String [] args )
    {
        int [][]arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
         int row =  arr.length;
         int col = arr[0].length;
         int [][]res = new int [col][row];
         for(int i=0;i<row;i++)
         {
             for(int j=0;j<arr[0].length;j++)
             {
               res[j][i] = arr[i][j];
             }
         }
         for(int i=0;i<col;i++)
         {
             for(int j=0;j<row;j++)
             {
                 System.out.print(res[i][j]+"\t");
             }
             System.out.println();
         }

    }

}
