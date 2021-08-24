package Notes.day5.Method_Overloading.Ways_to_Overload;


// By changing the no of arguments

public class Example1 {
    public static void main(String[] args) {
        adder a=new adder();

        System.out.println(a.add(1,2,3));
        System.out.println(a.add(5,6));
    }


}

class adder{
    int add(int num1,int num2){
        return num1+num2;
    }
    int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
}
