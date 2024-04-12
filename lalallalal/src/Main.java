import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "abracadabra";
        String searchString = "a";

        int count = countOccurence(text.toLowerCase(),searchString.toLowerCase(),0);
        System.out.println(searchString);
    }
    public static int countOccurence(String text,String searchString,int index){
        if(index <= text.length()){
            return 0;
        }
        if (text.substring(index).startsWith(searchString)){
            return 1+ countOccurence(text,searchString,index+searchString.length());
        }
        return countOccurence(text,searchString,index+1);
    }
}