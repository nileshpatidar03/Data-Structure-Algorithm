package ArrayWithDSA;

public class containerwithmostwater
{
    public static int water(int [] arr)
    {
        int n = arr.length;
        int first = 0;
        int last  = n-1;
        int maxarea = 0;
        while( first < last )
        {
            int height = Math.min(arr[first] ,arr[last]);
            int width = last -first;
            int area = height * width;

            maxarea = Math.max(maxarea , area);

            if(arr[first] < arr[last ])
            {
                first++;
            }
            else
            {
                last--;
            }
        }
        return maxarea;
    }

    public static void main(String [] args)
    {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerwithmostwater.water(arr));
    }
}
