package DataStructures.Arrays.Code;

//Find subarray with given sum

public class Code14 {

    static int subarray(int arr[],int sum){
        int n=arr.length;
        int curr_sum;

        for(int i=0;i<n;i++){
            curr_sum=arr[i];

            for(int j=i+1;j<n;j++) {
                if (curr_sum == sum) {
                int p = j - i;
                System.out.println("TestPair found btw " + i + " and " + p);
                return 1;
            }
                if(curr_sum>sum|| j==n){
                    break;
                }
                curr_sum+=arr[j];
            }
        }
        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {

        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        subarray(arr,23);
    }
}
