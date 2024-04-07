import java.util.Scanner;
//To check whether a given number n is prime or composite.
//The isPrime function takes an integer n as input and returns true if n is prime, and false otherwise.
//Time complexity:O(n)

public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)){
            System.out.println("prime");
        } else{
            System.out.println("composite");
        }
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for(int i = 0;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
