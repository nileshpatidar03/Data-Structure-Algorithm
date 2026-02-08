package ArrayWithDSA;

public class findtarget
{
    public static boolean target(int [][] arr, int target)
    {
        int m = arr.length;
        int n= arr[0].length;
        int i=0,j=n-1;
        while(i<m &&  j>=0)
        {
            if(arr[i][j] > target )
            {
                j--;
            }
            else if(arr[i][j] < target )
            {
                i++;
            }
            else
            {
                return true;
            }

        }
        return false;
    }
    public static void main(String [] args)
    {
        int [][] arr = {
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}
        };
        int target  = 5;
       //  findtarget.target(arr,target);
        System.out.println(findtarget.target(arr, target));

    }
}
