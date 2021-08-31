package DataStructures.Arrays.Code;
import java.util.Arrays;

// Move Zeros To End Of An Array

public class Code10_2 {

    static void moveZerosToEnd(int arr[]){

        int counter= arr.length-1;

        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[counter]=arr[i];
                counter--;
            }
        }

        while(counter>=0 ){
            arr[counter]=0;
            counter--;
        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {


        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
    }

}
