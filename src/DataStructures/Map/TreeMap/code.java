package DataStructures.Map.TreeMap;

import java.util.*;

public class code {

    static void freq(int arr[],int n){

        TreeMap<Integer,Integer> freq=new TreeMap<>();

        for(int i=0;i<n;i++){

            int temp=arr[i];

            if(freq.containsKey(arr[i])){
                freq.put(arr[i], freq.get(arr[i])+1);
            }else {
                freq.put(arr[i],1);
            }
        }
        for (Map.Entry m:freq.entrySet())
            System.out.println("Frequency of " + m.getKey() +
                    " is " + m.getValue());
    }

    public static void main(String[] args) {

        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        freq(arr, arr.length);
    }

}
