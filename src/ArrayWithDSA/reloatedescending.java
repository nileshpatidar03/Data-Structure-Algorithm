package ArrayWithDSA;

public class reloatedescending
{
    public static int[] reloate(int [] arr , int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n -1; i >= k; i--) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String  [] args)
    {
        int [] arr = {1,2,3,4,5,6,7,8};
        int k =5;

        //  System.out.println(first.reloate(arr,k));
        int[] result = reloatedescending.reloate(arr,k);
        for(int x : result)
        {
            System.out.println(x);
        }
    }
}
