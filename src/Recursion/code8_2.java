package Recursion;

// Return a reverse String

public class code8_2 {

    public static void main(String[] args) {

        System.out.println(rev("hello"));
    }

    static String rev(String str){
        if(str.isEmpty())
            return str;
        else{
            return rev(str.substring(1))+str.charAt(0);
        }
    }

}
