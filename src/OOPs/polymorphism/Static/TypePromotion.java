package OOPs.polymorphism.Static;

//Ambiguity can there


class sum{
    void add(int a,long b){
        System.out.println("1St function called");
    }
    void add(long a,int b){System.out.println("2Nd function called");}
}

public class TypePromotion {

    public static void main(String[] args) {

        sum obj=new sum();
//        obj.add(20,20);  // Ambiguity to call 1st or 2nd method

    }

}
