package Notes.day5.Method_Overloading.Ways_to_Overload;

// Main method Overloading

public class Example3 {


    public static void main(String[] args) {
        System.out.println("Main method with String[]");
    }

    public static void main(String args) {
        System.out.println("Main method without []");
    }

    public static void main() {
        System.out.println("Main method without any parameters");
    }

}
