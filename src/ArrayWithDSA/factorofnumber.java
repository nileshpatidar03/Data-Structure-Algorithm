package ArrayWithDSA;

import java.util.Scanner;

public class factorofnumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        int n = sc.nextInt();
        int [] ans = new int[n];
        int k=0;
        int i=1;
        while(i <= n)
        {
            if( n % i == 0)
            {
                ans[k++] = i;
                i++;
            }
            else {
                i++;
            }
        }
        for(int j=0;j<k;j++)
        {
            System.out.print(ans[j]+"\t");
        }
    }
}
