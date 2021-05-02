package Practice.day7.Encapsulation.Example2;

import Practice.day7.Encapsulation.Example2.Mypackage.Account;

public class Code {
    public static void main(String[] args) {

        Account acc=new Account();
        acc.setName("Abhishek");
        acc.setAge(18);
        acc.setAddress("Home");
        acc.setAmount(10000);

        System.out.println(acc.getName());
        System.out.println(acc.getAge());
        System.out.println(acc.getAddress());
        System.out.println(acc.getAmount());


    }
}
