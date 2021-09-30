package DataStructures.Stacks;

import java.util.Stack;

public class Brackets_Balanced {

//    public static boolean isBalanced(String exp){
//
//        Stack<Character> stack=new Stack<>();
//
//        for(int i=0;i<exp.length();i++){
//
//            if(exp.charAt(i)=='('){
//                stack.push(exp.charAt(i));
//            }else if(exp.charAt(i)==')'){
//                if(stack.isEmpty()){
//                    return false;
//                }
//                char topChar= stack.pop();
//                if(exp.charAt(i)==')' && topChar=='('){
//                    continue;
//                }else {
//                    return false;
//                }
//            }
//        }return stack.isEmpty();
//    }

    public static boolean isBalanced(String exp){

        if(exp.length()==0){
            return true;
        }

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<exp.length();i++){

            if(exp.charAt(i)=='('){
                stack.push(exp.charAt(i));
            }else if(exp.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }else {

                    char topChar=stack.pop();
                    if(exp.charAt(i)==')' && topChar=='('){
                        continue;
                    }

                }
            }

        }return stack.isEmpty();

    }

    public static void main(String[] args) {

        String str="(()()())";
        System.out.println(isBalanced(str));

    }

}
