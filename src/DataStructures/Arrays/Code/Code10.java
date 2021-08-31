package DataStructures.Arrays.Code;

// Move Zeros To End Of An Array

import java.util.Arrays;

public class Code10 {

    static void moveZerosToEnd(int arr[]){

        int counter=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[counter]=arr[i];
                counter++;
            }
        }

        while(counter< arr.length){
            arr[counter]=0;
            counter++;
        }

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {


        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});

        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
    }

}
