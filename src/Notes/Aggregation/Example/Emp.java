package Notes.Aggregation.Example;

public class Emp {
    int id;
    String name;
    Address address; // Aggregation

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void print(){

        System.out.println(id +"  " + name);

        System.out.println(address.city +"  " +address.state + "  " + address.country );

    }

    public static void main(String[] args) {
        Address address1=new Address("kalka","pinjore","Haryana");
        Address address2=new Address("Chandigarh","Mohali","Punjab");

        Emp e1=new Emp( 1 , "Kunal",address1);
        Emp e2=new Emp( 2 , "Raj",address2);

        e1.print();
        e2.print();

    }

}
