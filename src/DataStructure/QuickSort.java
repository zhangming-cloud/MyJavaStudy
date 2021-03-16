package DataStructure;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public int[]qs(int[]arr,int l,int r)
    {
        int t;
        int i=l;
        int j = r;
        int p=arr[l];
        while(i<j)
        {
            while(i<j && arr[j]>p)
                j--;
            while(i<j&&arr[i]<p)
                i++;
            if(arr[i]==arr[j]&&i<j)
                i++;
            else
            {
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }


        }

        if (i-1>l) arr=qs(arr,l,i-1);
        if(j+1<r)arr=qs(arr,j+1,r);
        return arr;



    }

    public static void main(String[] args) {
        int []arr=new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i]= random.nextInt(10000);
        }
        QuickSort quickSort = new QuickSort();
        arr=quickSort.qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
