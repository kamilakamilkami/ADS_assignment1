import java.util.Scanner;
//The program gives the power of the n
//Time complexity:O(n)
public class prob6 {
    public static void main(String[] args) {
        gimmeApowerofN();
    }
    public static void gimmeApowerofN(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        long res = power(a,n);
        System.out.println(res);
    }
    public static long power(int a,int n){
        if (n==0){
            return 1;
        }
        return n*power(a,n-1);
    }
}
