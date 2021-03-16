package CCF;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class tzot_t {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int[][]a=new int[n][2];
        for (int i = 0; i < n; i++) {

            a[i][0]=scanner.nextInt();
            a[i][1]=scanner.nextInt();
        }
        Arrays.sort(a,(c,b)->c[0]-b[0]);
        int cnt=0;
        int p=a[0][0];
        for (int i = 0; i < n; i++) {
            if((a[i][0]>=p)==(a[i][1]==1))
                cnt++;
        }

        int index = 0;
        int max=cnt;
        int k=1;
        int nc = 0;
        for (int i = 1; i < n; i++) {

            if(a[i][0]==a[i-1][0])
                continue;
            for (int j = i-1; j >= 0 ; j--) {
                if(a[j][0]==a[i-1][0]){
                    if((a[j][0]>=p)==(a[j][1]==1))
                        cnt--;
                    else
                        cnt++;
                }else
                    break;

            }
            if(cnt>=max)
            {
                max=cnt;
                index=i;
            }
            p=a[i][0];

        }
        System.out.println(a[index][0]);



    }
}
