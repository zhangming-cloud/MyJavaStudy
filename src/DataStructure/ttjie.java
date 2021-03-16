package DataStructure;

public class ttjie {

    public  int C( int m,int n) {
        double t = 1;
        if (n < m - n) {
            return C(m, m - n);
        }
        for (int i = 0; i < m - n; i++) {
            t *= n + i + 1;
            t /= i + 1;
        }
        return (int) t;
    }
    public int test(int n)
    {
        int  sum=0;
        for (int i = 0; i <=n/2; i++) {
            sum=sum+C(n-i,i);
        }


        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new ttjie().test(2));
    }


}
