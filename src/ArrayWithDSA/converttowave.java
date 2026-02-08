package ArrayWithDSA;


public class converttowave {


    static void   relote(int [] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]  = temp;
            i++;
        }


    }
    public static void main(String [] args)
    {
        int [] arr = {2,4,7,8,9,10};
        converttowave.relote(arr);
        for(int x : arr)
        {
            System.out.println(x);
        }
    }

}
