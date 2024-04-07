import java.util.Scanner;

//Read the number n and create an array of size n.Iterates through the array to find the minimum element.
//Time complexity:O(n)
public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = findMin(arr);
        System.out.println(min);
        sc.close();
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;
    }

}