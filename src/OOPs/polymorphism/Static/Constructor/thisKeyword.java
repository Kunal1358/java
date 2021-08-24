package OOPs.polymorphism.Static.Constructor;

// this inside ctr is used to call other ctr of same class

class emp{

    int id,passoutYear;
    String name,contactNo,collegeName;

    emp(String contactNo, String collegeName, int passoutYear){
        this.contactNo = contactNo;
        this.collegeName = collegeName;
        this.passoutYear = passoutYear;
    }

    emp(int id, String name){
        this("9899234455", "IIT Kanpur", 2018);
        this.id = id;
        this.name = name;
    }

}

public class thisKeyword {

    public static void main(String[] args) {

        emp s = new emp(101, "John");
        System.out.println("Printing Student Information: \n");
        System.out.println("Name: "+s.name+"\nId: "+s.id+"\nContact No.: "+s.contactNo+"\nCollege Name: "+s.contactNo+"\nPassing Year: "+s.passoutYear);

    }
}
