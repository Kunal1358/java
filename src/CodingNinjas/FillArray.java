package CodingNinjas;

public class FillArray {

    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void arrange(int arr[],int n){

        int left=0;
        int right=n-1;
        int counter=1;

        while (left<=right){
            if(counter%2==1){
                arr[left]=counter;
                counter++;
                left++;

            }else {
                arr[right]=counter;
                counter++;
                right--;
            }
        }


    }

    public static void swap(int arr[],int n){
        int temp;
        for(int i=0;i<n;i+=2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

    }

    public static int findUnique(int arr[],int n){

        for(int i=0;i<n;i++){
            int j=1;
            for(j=1;j<n;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j== arr.length){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;

    }

    public static int findDublicate(int arr[],int n){

        for(int i=0;i<n;i++){
            int j=1;
            for(j=1;j<n;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        return arr[i];
                    }
                }
            }
        }
        return Integer.MAX_VALUE;

    }

    public static void intersection(int arr1[],int arr2[]){

        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }

    }

    public static void pairSum(int arr[],int n,int sum){

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) {

                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+ " "+ arr[j]);
                }

            }
        }

    }

    public static void sortToZeros(int arr[]){
        int nextZero =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero++;
            }
        }
    }



    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();


        int arr[]=new int[]{0,7, 2, 5, 4, 7, 1, 3, 6};

        int arr1[]=new int[]{ 2, 6, 1 ,2};

        int arr2[]=new int[]{1 ,2 ,3 ,4 ,2};

//        intersection(arr1,arr2);
//        int arr3[]=new int[]{1, 3, 6, 2, 5, 4, 3, 2, 4};
//        pairSum(arr3,arr3.length,12);

        int arr4[]=new int[]{1 ,0, 1, 1, 0, 1, 0, 1};
        sortToZeros(arr4);
        print(arr4, arr4.length);



////        arrange(arr,arr.length);
//        System.out.println(findUnique(arr, arr.length));
//
//        System.out.println(findDublicate(arr, arr.length));


     //   print(arr,arr.length);





    }

}
