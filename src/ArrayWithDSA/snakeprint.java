package ArrayWithDSA;

public class snakeprint
{
    static void snake(int [][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if( i %2 == 0)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    System.out.print(arr[i][j]+"\t");
                }
            }
            else
            {
                for(int j=arr[0].length-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
    }
    public static void main(String [] args)
    {
    int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,5,7,6},
            {4,5,67,8}
    };
    snakeprint.snake(arr);
    }
}
