package DataStructures.Strings.Tokenizer;

import java.util.StringTokenizer;

public class code1 {

    public static void main(String[] args) {
        StringTokenizer str=new StringTokenizer("hello, my , name , is , Khan");
        StringTokenizer str1=new StringTokenizer("Hello i am string Tokenizer",",");

        while(str1.hasMoreTokens()){
            System.out.println(str1.nextToken());
        }

        System.out.println("********************");

        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }

}
