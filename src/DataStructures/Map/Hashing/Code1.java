package DataStructures.Map.Hashing;

// Majority Element
// A majority element in an array A[] of size n is an element that appears more than n/2 times

public class Code1 {

    static void majority(int arr[],int n){

        int maxCount=0;
        int index=-1;

        for(int i=0;i<arr.length;i++){
            int count=0;

            for(int j=0;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
                if(count>maxCount){
                    maxCount=count;
                    index=i;
                }
            }

            if(maxCount>n/2){
                System.out.println("Majority element is " + arr[index]);
            }else {
                System.out.println("No majority element");
            }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1,

                2, 1, 3, 5, 1 };
        int n = arr.length;

        majority(arr,n);

    }

}

/*

Time complexity - O(n*n)
Auxiliary Space - O(1)

 */
