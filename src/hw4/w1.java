package hw4;

import java.util.Arrays;

public class w1 {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5,6,7,8,9,19};
        int[]B={2,5,8,3,6,9,123,44,6,7,99};
        w1 W = new w1();
        System.out.println(W.Determine(A,B,54)?"yes":"no");


    }
    public  boolean Determine(int[]A, int[]B,int x)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int [] A1=new int [A.length];
        for (int i = 0; i < A.length; i++) {
            A1[i]=x-A[i];

        }
        Arrays.sort(A1);

        int k=0,q=0;
        while(k<A1.length&& q<B.length) {

            if(A1[k]>B[q])
            {
                q++;
            }
            else if(A1[k]<B[q])
            {
                k++;
            }
            else if(A1[k]==B[q])
            {
                return true;
            }
        }


        return false;
    }
}
