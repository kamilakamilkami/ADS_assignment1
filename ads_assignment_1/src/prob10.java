import java.util.Scanner;
//Finds GCD of a and b using Euclidean Algorithm
//Time complexity:O(log(n))

public class prob10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        long gcd = findGCD(a,b);
        System.out.println(gcd);
    }
    public static long findGCD(int a,int b){
        if(b==0){
            return a;
        }
        return findGCD(b,a%b);
    }
}
