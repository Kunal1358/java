package Notes.Static.Static_Keyword;

public class Code1 {

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3= new Counter();
    }
}

class Counter{

    int count=0;

    Counter(){
        count++;
        System.out.println(count);
    }
}


/*

memory is allocated again and again, every time ctr is called.

 */