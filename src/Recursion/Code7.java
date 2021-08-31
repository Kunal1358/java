package Recursion;

// Pallndrome string

public class Code7 {

    public static void main(String[] args) {

        System.out.println(check("madam"));
    }

    static boolean check(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }
        if (str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }else{

            return check(str.substring(1,str.length()-1));
        }
    }

}
