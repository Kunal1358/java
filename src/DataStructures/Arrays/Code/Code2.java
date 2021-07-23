package DataStructures.Arrays.Code;

//Array of objects

class student{
    int rollno;
    String name;

    student(int rollno,String name){
        this.name=name;
        this.rollno=rollno;
    }
}

public class Code2 {

    public static void main(String[] args) {

        student array[]=new student[5];

        array[0] =new student(1,"Kunal");
        array[1]=new student(2,"raj");
        array[2] =new student(3,"Abhi");
        array[3]=new student(4,"Tom");
        array[4]=new student(5,"cat");

        for(int i=0;i<array.length;i++){
            System.out.println(array[i].rollno + " " + array[i].name);
        }

    }
}

