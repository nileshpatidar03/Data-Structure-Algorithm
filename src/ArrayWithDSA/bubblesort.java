package ArrayWithDSA;

public class bubblesort
{
    public static void main(String [] args)
    {
        int []arr = {5,1,4,2,8,3,7,9,0,1};
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] > arr[j] )
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int x : arr )
        {
            System.out.println(x);
        }
    }
}
