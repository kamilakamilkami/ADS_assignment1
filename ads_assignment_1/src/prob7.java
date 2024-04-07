import java.util.Scanner;
//Defines a recursive method called reverseArr
//Takes 2 parameters: the array and the index of the current element to be swap by themselves
//Time complexity:O(n)
public class prob7 {
    public static void main(String[] args) {
        reverseArr();
    }
    public static void reverseArr(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        reverse(arr,0,n-1);
        for(int num : arr){
            System.out.println(num+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end] = temp;

        reverse(arr,start+1,end-1);
    }
}
