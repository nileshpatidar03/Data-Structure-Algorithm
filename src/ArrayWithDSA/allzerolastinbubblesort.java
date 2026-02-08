package ArrayWithDSA;

public class allzerolastinbubblesort
{
    public static void main(String [] args )
    {
        int [] arr = {1,0,-2,3,0,4,0,8,11};
        int n = arr.length;
        int i=0,j=0;
        while(i<n)
        {
            if(arr[i] == 0)
            {
                i++;
            }
            else
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;

            }
        }
        for(int x :arr)
        {
            System.out.println(x);
        }
    }
}
