package DataStructures.Map.Hashing;

import java.util.HashMap;

// Majority element using HashMap

public class Code2 {

    static int majority(int arr[],int n){

        int ans=-1;

        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int i=0;i<n;i++) {

            if (freq.containsKey(arr[i])) {
                // Checking if freq contains the key or not
                // If contains increment the prev value by 1
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                // If freq does not contains key then put key and
                // initialize count to 1
                freq.put(arr[i], 1);
            }
            if (freq.get(arr[i]) > n / 2) {
                // condition to check majority
                ans = arr[i];
            }
        }
            return ans;
    }

    public static void main(String[] args) {

        int a[] = {2, 2, 1, 1, 1, 2, 2};
        int n = a.length;
        System.out.println(majority(a, n));
    }
}

/*

Time complexity - O(n)
Auxiliary Space - O(n)

 */
