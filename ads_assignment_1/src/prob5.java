import java.util.Scanner;
//In the recursive case, the method recursively calls itself with n-1 and n-2 to calculate the (n-1)th and (n-2)th elements in the sequence, and returns their sum.
//Time complexity:O(2^n)
public class prob5 {
    public static void main(String[] args) {
        findNthFibonacci();
    }


    public static void findNthFibonacci() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long res = fibonacci(n);
        System.out.println(res);
    }


    public static long fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
