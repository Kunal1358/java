package Notes.day5.Method_Overloading.Ways_to_Overload;

class action{
    static int add(int num1,int num2){
        return num1 + num2;
    }
    static double add(double num1 ,double num2){
        return num1 + num2;
    }
}

public class Example2 {
    public static void main(String[] args) {

        System.out.println(action.add(1,2));
        System.out.println(action.add(1.2,2.8));
    }
}
