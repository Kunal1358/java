package DataStructures.Map.CodingNinjas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class RemoveDuplicates {

    // O(N)
    public static ArrayList<Integer> removeDuplicates(int arr[]){

        ArrayList<Integer> output=new ArrayList<>();
        HashMap<Integer,Boolean> seen=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            if(seen.containsKey(arr[i])){
                continue;
            }else {
                output.add(arr[i]);
                seen.put(arr[i],true );
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3,7,2,81};
        ArrayList<Integer> output=removeDuplicates(arr);
        for(int i=0;i< output.size();i++){
            System.out.print(output.get(i)+" ");
        }


    }

}
