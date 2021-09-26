package Notes.Aggregation;

class operation{
    int square(int n){
        return n*n;
    }
}


class circle{

    operation op; // Aggregation

    double pi=3.14d;

    double area(int radius){
        op=new operation();

        int square=op.square(radius); //code reusability (i.e. delegates the method call).
        return pi*square;
    }

}

public class Code1 {

    public static void main(String[] args) {
        circle c = new circle();
        double result= c.area(5);
        System.out.println("Result = " + result);

    }

}
