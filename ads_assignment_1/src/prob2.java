import java.util.Scanner;

//Calculates through the array the sum of all elements.
//Divides the sum by the num of element to find the average.
//Time complexity: O(n)
public class prob2 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];

         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
         }

         double average = findAv(arr);

         System.out.println(average);

         sc.close();
      }
      public static double findAv(int[] arr) {
         int sum = 0;
         for (int num : arr) {
            sum += num;
         }
         return (double) sum / arr.length;
      }
}
