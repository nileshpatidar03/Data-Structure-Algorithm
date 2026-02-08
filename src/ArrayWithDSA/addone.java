package ArrayWithDSA;

public class addone {
    static int[] two(int[] a, int[] b) {
        int n = a.length;
        int carry = 0;
        int res[] = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            if (sum <= 9) {
                res[i+1] = sum;
                carry = 0;
            } else {
                res[i+1] = sum % 10;
                carry = 1;
            }
        }
           if(carry == 0) {
               res[0] = carry;
           }

        return res;

    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6};
        int[] b = {5, 9, 7};
        int[] result = addone.two(a, b);


        for (int x : result) {
            System.out.print(x + " ");

        }
    }
}


