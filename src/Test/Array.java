package Test;

public class Array {
    public static void main(String[] args) {

        int arr[]=new int[10];

        for(int i=0;i< arr.length;i++){
            arr[i]=i+10;
        }

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int temp[]=arr;
        arr=new int[20];

        for(int i=0;i< arr.length;i++){
            System.out.println(temp[i]);
        }

    }
}
