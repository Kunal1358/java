package Practice.day1.questions;

public class Leap_Year {
    public static void main(String[] args) {
        int year=2021;

        if( (year % 4==0) && (year % 100 !=0) || (year %400==0) ){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }

    }
}


/*

 A year is a leap year if it is divisible by 4 and 400 but not by 100

 */