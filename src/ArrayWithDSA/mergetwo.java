package ArrayWithDSA;

public class mergetwo
{
    static int[] merge(int [] a, int [] b)
    {
        int m = a.length;
        int n = b.length;
        int [] arr = new int[m+n];
        int i=0,j=0, k=0;
        while(i<m && j<n)
        {
            if(a[i] < b[j])
            {
                arr[k++] = a[i++];
            }
            else
            {
                arr[k++]  = b[j++];
            }

        }
        while (i < m)
        {
            arr[k++] = a[i++];
        }

        while (j < n)
        {
            arr[k++] = b[j++];
        }

        return arr;
    }
    public static void main(String [] args)
    {
        int []a = {2,4,6};
        int []b = {1,3,5};
        int [] result = mergetwo.merge(a,b);
        for(int x : result)
        {
            System.out.println(x);
        }
    }




}
