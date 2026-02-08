package ArrayWithDSA;

public class buyandsellstock {
    public static void main(String[] args)
    {
        int [] a = {7,1,5,3,6,4 };
        int n  = a.length;
        int minprice = a[0];
        int maxprice = 0;
        for(int i=1;i<n;i++)
        {
            if(a[i] <minprice )
            {
                minprice = a[i];
            }
            else
            {
                int profit = a[i] - minprice;
                if(profit > maxprice)
                {
                    maxprice = profit;
                }
            }
        }
        System.out.println(maxprice);
    }
}
