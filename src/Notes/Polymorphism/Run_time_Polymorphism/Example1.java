package Notes.Polymorphism.Run_time_Polymorphism;

class Bank{
    float getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    float getRateOfInterest(){
        return 8.4f;
    }
}

class ICIC extends Bank{
    float getRateOfInterest(){
        return 4.7f;
    }
}

class HDFC extends Bank{
    float getRateOfInterest(){
        return 2.77f;
    }
}

public class Example1 {

    public static void main(String[] args) {

        Bank b;

        b=new SBI();
        System.out.println("SBI = "+ b.getRateOfInterest());

        b=new HDFC();
        System.out.println("HDFC = "+ b.getRateOfInterest());

        b=new ICIC();
        System.out.println("ICIC = "+ b.getRateOfInterest());

    }
}
