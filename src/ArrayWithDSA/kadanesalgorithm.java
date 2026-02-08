package ArrayWithDSA;

public class kadanesalgorithm
{
    public static int kadane(int [] arr)
    {
        int n = arr.length;
        int cursum= 0;
        int maxsum = 0;
        for(int i=0;i<n;i++)
        {
            cursum  = cursum + arr[i];

            if(cursum > maxsum)
            {
                maxsum = cursum;
            }
            if(cursum <0)
            {
                cursum =0;

            }


        }
        return maxsum;
    }
    public static void main(String [] args)
    {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(kadanesalgorithm.kadane(arr));
    }
}
