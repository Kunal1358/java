package BasicCodes;

// Decimal to Binary

public class code3 {

    public static void main(String[] args) {

        int num=45;
        dec_Bin(num);
    }
    static void dec_Bin(int n){

        int array[]=new int[100];
        int i=0;

        while(n>0){
            array[i++]=n%2;
            n/=2;
        }

        for(int j=i-1;j>=0;j--){
            System.out.print(array[j]+ " ");
        }
    }
}
