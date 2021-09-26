package Notes.this_keyword.Usages;

// refer to current class instance variable

public class Usage1 {
    public static void main(String[] args) {

        use1 obj = new use1(1,"Kunal","Chitkara");

        obj.display();

    }
}

class use1{
    private int id;
    private String name;
    private String Clg;
/*


    //Without using this

    use1(int val1,String val2, String val3){
        id=val1;
        name=val2;
        Clg=val3;
    }
    */

    //Using this keyword
    use1(int id,String name ,String clg){
        this.Clg=clg;
        this.id=id;
        this.name=name;
    }


    void display(){
        System.out.println("Id = " + id +"  Name = " + name +"  Clg = " + Clg );
    }

}
