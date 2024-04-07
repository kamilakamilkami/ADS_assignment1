import java.util.Scanner;
//The factorial method calculates the factorial of a given number "n" using recursion.
//Time complexity:O(n)
public class prob4{
    public static void main(String[] args) {
        findFactorial();
    }

    public static void findFactorial() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        long res = factorial(n);
        System.out.println(res);
    }


    public static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
