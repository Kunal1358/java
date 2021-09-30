package Recursion;
// not clear
public class replacePi {

    public static String removePi(String str){

        String output="";
        if(str.length()<=1){
            return str;
        }
        String smallAns=removePi(str.substring(1));
        if(str.charAt(0)=='p' && smallAns.charAt(0)=='i'){
            output ="3.14"+smallAns.substring(1);
        }else {
            output = str.charAt(0)+smallAns;
        }return output;
    }

    public static void main(String[] args) {
        String str="xpix";
        System.out.println(removePi(str));
    }

}
