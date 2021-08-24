package Notes.day8.Exception_Handling.throws_keyword;

/*

Finalize is used to perform clean up processing just before object is garbage collected.

 */

class FinalizeExample{

    public void finalize(){
                    System.out.println("finalize called");
                }

    public static void main(String[] args){

        FinalizeExample f1=new FinalizeExample();
        FinalizeExample f2=new FinalizeExample();

        f1=null;
        f2=null;

        System.gc();
    }
}