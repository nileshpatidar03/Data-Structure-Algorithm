package ArrayWithDSA;


public class snakecolumnprint
{
    static void snakecolumn(int [][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if( i % 2 ==0 )
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    System.out.print(arr[j][i]+ "\t");
                }
            }
            else
                for(int j=arr[0].length-1;j>=0;j--)
                {
                    System.out.print(arr[j][i]+ "\t");
                }
        }

    }
    public static void main(String [] args)
    {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,7,5,3},
                {12,45,78,64}
        };
        snakecolumnprint.snakecolumn(arr);

    }
}

