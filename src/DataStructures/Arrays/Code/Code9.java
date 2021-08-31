package DataStructures.Arrays.Code;

// Second largest in an array

import java.util.Scanner;

public class Code9 {

    public static void main(String[] args) {


        Scanner sc=new Scanner((System.in));
        int n= sc.nextInt();
        int array[]=new int[n];

        for (int i=0;i<n;i++)
            array[i]= sc.nextInt();
        int ans;
        ans=SecondLargest(array);
        System.out.println(ans);

    }

    static int SecondLargest(int array[]){

        int firstLargest,SecondLargest;

        if(array[0]>array[1]){
            firstLargest=array[0];
            SecondLargest=array[1];
        }else{
            firstLargest=array[1];
            SecondLargest=array[0];
        }

        for(int i=2;i<array.length;i++){

            if(array[i]>firstLargest){
                SecondLargest=firstLargest;
                firstLargest=array[i];
            }else if(array[i]<firstLargest && array[i]> SecondLargest ) {
                SecondLargest=array[i];

            }
        }
        return SecondLargest;

    }

}
