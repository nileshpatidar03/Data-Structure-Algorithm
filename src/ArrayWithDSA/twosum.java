package ArrayWithDSA;

 class summ {
     public static void  sum(int [] arr , int target)
     {
         int n = arr.length;
         for(int i=0;i<n-1;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 if(arr[i] + arr[j] ==target )
                 {
                     System.out.println("Index of sum is = "+i+j+"="+ target);
                 }
             }
         }
     }
}
public class twosum
{
    public static void main(String [] args)
    {
        int [] arr = {4,5,6,7,8,9};
        int target = 10;
        summ.sum(arr,target);
    }
}
