package CCF;

import java.util.Arrays;
import java.util.Scanner;

public class tzot_o {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int[][]a=new int[n][2];
        for (int i = 0; i < n; i++) {

            a[i][0]=scanner.nextInt();
            a[i][1]=scanner.nextInt();
        }
        Arrays.sort(a,(c, b)->c[1]-b[1]);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i][0]+" ");
            System.out.println(a[i][1]);
            System.out.println("\n");
        }


    }
}
