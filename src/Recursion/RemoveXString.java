package Recursion;

public class RemoveXString {

    public static String removeX(String str){

        if(str.length()==0){
            return str;
        }
        String ans="";
        if(str.charAt(0)!='x'){
            ans+=str.charAt(0);
        }
        String small_ans=removeX(str.substring(1));
        return ans+small_ans;
    }

    public static void main(String[] args) {
        String str="xxxx";
        System.out.println(removeX(str));
    }

}
