package Practice.day1.control_statements;

public class labled_for_loop {
    public static void main(String[] args) {

        bb:
        for(int i=1;i<5;i++){
            aa:
            System.out.print(i +"->");
            //System.out.println();
            for (int j=1;j<5;j++){
                System.out.print(j +" ");
                if(j==2 && i==2){
                    System.out.print("found" );
                    break bb;
                }
            }
            System.out.println();
        }
    }
}

/*

label used to skip the part
if we used break aa: then that will be the default work of break statement
instead we used bb: to break both loops

 */