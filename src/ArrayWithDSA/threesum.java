package ArrayWithDSA;

public class threesum
{
    public static void main(String [] args )
    {
        int [] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        int [] res = new int [n*2];
        int m=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k] == 0)
                    {
                        res[m++] = arr[i];
                        res[m++] = arr[j];
                        res[m++] = arr[k];
                    }
                }
            }
        }
        for(int i=0;i<m;i=i+3)
        {
            System.out.println(res[i]+" "+res[i+1]+" "+res[i+2]);
        }

    }
}
