package Practice.day3.Static.Static_Method;

public class static_block {
    static {
        System.out.println("Outside main");
    }

    public static void main(String[] args) {
        System.out.println("inside main");
    }
}

/*

Is used to initialize the static data member.
It is executed before the main method at the time of classloading.

 */