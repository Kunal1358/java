package DataStructures.Stacks.CodingNinjas;

import java.util.Stack;

public class BalanceBrackets {

//    public static int balance(String exp){
//
//        int len=exp.length();
//        if(len==0){
//            return 0;
//        }
//        if(len%2!=0){ //  Odd expression can't be reversed
//            return -1;
//        }
//
//        Stack<Character> stack=new Stack<>();
//
//        for(int i=0;i<len;i++){
//            char currChar=exp.charAt(i);
//            if(currChar=='{'){
//                stack.push(currChar);
//            }else {
//                if(!stack.isEmpty() && stack.peek()=='{'){
//                    stack.pop();
//                }else {
//                    stack.push(currChar);
//                }
//            }
//        }
//
//        int count=0;
//        while (!stack.isEmpty()){
//            char char1=stack.pop();
//            char char2=stack.pop();
//            if(char1!=char2){
//                count+=2;
//            }else {
//                count+=1;
//            }
//        }
//        return count;
//
//    }
    public static int balance(String exp) {

        int len=exp.length();
        if(len==0){
            return 0;
        }
        if(len%2!=0){
            return -1;// odd case
        }
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<len;i++){
            char currChar=exp.charAt(i);
            if(exp.charAt(i)=='{'){
                stack.push(currChar);
            }else {
                if(!stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }else {
                    stack.push(currChar);
                }
            }
        }
        int count=0;
        while (!stack.isEmpty()){
            char c1= stack.pop();
            char c2= stack.pop();
            if(c1!=c2){
                count+=2;
            }else {
                count+=1;
            }
        }return count;
    }





    public static void main(String[] args) {

        String exp="{{{{}}";
        System.out.println(balance(exp));
    }

}
