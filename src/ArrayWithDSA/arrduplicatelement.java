package ArrayWithDSA;

public class arrduplicatelement {
    public static void main(String[] args) {


        int [ ]arr = {2,3,4,5,6,1,2,35,7,8,0,6,6};
        int n = arr.length;
        int val = 6;
        int count =0;
        for(int i=0;i<n;i++ )
        {
            if(arr[i] != val)
            {
                continue;
            }
            count++;

        }
            System.out.print(count);

    }
}



