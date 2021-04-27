package Practice.day3.Static.Static_Keyword;

public class Code2 {
    public static void main(String[] args) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3=new counter();
    }

}

class counter{

    static int count=0;

    counter(){
        count++;
        System.out.println(count);
    }
}

/*

memory is allocated once and hence it increment the count every time the ctr is called.

 */