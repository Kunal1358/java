package Notes.Static.Static_Method;

public class Cube_of_number {
    public static void main(String[] args) {


        int result=cube.calculate(5);
        System.out.println(result);

    }
}

class cube{

    static int calculate(int num){
        return num*num*num;
    }

}
