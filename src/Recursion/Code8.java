package Recursion;

// Reverse a String

public class Code8 {
    public static void main(String[] args) {

        rev("Hello");
    }

    static void rev(String str){
        if (str==null || str.length()<1){
            return ;
        }else{
            System.out.println(str.charAt(str.length()-1));
            rev(str.substring(0,str.length()-1));
        }
    }

}


