package ArrayWithDSA;

public class selectionsort {
    public static void selection( int [] arr)
    {
        int n  = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minindex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[minindex])
                {
                    minindex = j;
                }

            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String [] args )
    {
        int [] arr = {4,50,7,45,28,8};
       selectionsort.selection(arr);

        for(int x : arr)
        {
            System.out.println(x);
        }
    }
}
