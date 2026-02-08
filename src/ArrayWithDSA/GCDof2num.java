package ArrayWithDSA;

import java.util.Scanner;

public class GCDof2num
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter one  number");
        int m = sc.nextInt();
        System.out.println("please enter second number");
        int n = sc.nextInt();
        int factor  =0;
        for(int i=2;i<Math.max(m,n);i++)
        {
            if(m %i == 0 && n %i == 0)
            {
                factor  = i;
            }
        }

        System.out.println(factor);
    }
}
