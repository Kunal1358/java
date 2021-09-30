package DataStructures.Stacks.CodingNinjas;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {

//        StackUsingArrays stack=new StackUsingArrays(100);
          StackUsingLL stack=new StackUsingLL();

        System.out.println(stack.isEmpty());

        for(int i=0;i<10;i++){
            stack.push(i+1);
        }
        System.out.println(stack.top());

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }


    }
}
