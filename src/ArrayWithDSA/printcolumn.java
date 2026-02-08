package ArrayWithDSA;

public class printcolumn
{
    static  void  column(int [][] arr)
    {
         for( int i=0;i<arr.length;i++)
         {
             for(int ele : arr[i])
             {
               System.out.print(ele+"\t");
             }
             System.out.println();
         }

    }
    public static void main(String [] args)
    {
        int [][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,0},
                {9,8,7,6,5}
        };
         printcolumn.column(arr);



    }
}
