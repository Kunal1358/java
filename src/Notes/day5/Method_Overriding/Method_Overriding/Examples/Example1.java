package Notes.day5.Method_Overriding.Method_Overriding.Examples;


class Bank{
    int getRateofInterest(){
        return 0;
    }
}

class SBI extends Bank{
    int getRateofInterest(){
        return 8;
    }
}

class ICIC extends Bank{
    int getRateofInterest(){
        return 7;
    }
}

class PNB extends Bank{
    int getRateofInterest(){
        return 9;
    }
}


public class Example1 {
    public static void main(String[] args) {

        SBI s=new SBI();
        ICIC i =new ICIC();
        PNB p=new PNB();

        System.out.println("SBI Rate of Interest: " + s.getRateofInterest());
        System.out.println("ICIC Rate of Interest: " + i.getRateofInterest());
        System.out.println("PNB Rate of Interest: " + p.getRateofInterest());
    }
}
