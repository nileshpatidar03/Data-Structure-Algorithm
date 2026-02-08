package ArrayWithDSA;

import java.util.Arrays;

public class  removeduplicatearr {


        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,4,1,2,3};

            Arrays.sort(arr);

            int k = 0;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] != arr[k]) {
                    arr[++k] = arr[i];
                }
            }

            for(int i = 0; i <= k; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

