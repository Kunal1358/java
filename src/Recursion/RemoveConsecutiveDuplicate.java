package Recursion;

public class RemoveConsecutiveDuplicate {

    public static String remove(String str){
        if(str.length()<=1){
            return str;
        }

        if(str.charAt(0)==str.charAt(1)){
            return remove(str.substring(1));
        }else {
            String small_ans=remove(str.substring(1));
            return str.charAt(0)+small_ans;
        }
    }

    public static void main(String[] args) {

        String  str="aa";
        System.out.println(remove(str));

    }

}
