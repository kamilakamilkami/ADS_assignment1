import java.util.Scanner;
//Reads 2 integers n and k,calculates the binomial coefficient C(n,k)
//Time complexity:O(2^n)

public class prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        long res = binCoeff(n,k);
        System.out.println(res);
    }
    public static long binCoeff(int n,int k){
        if (k==0 || k==n){
            return 1;
        }
        return binCoeff(n-1,k-1) + binCoeff(n-1,k);
    }
}
