package DataStructures.Strings.Buffer;

public class code1 {

    public static void main(String[] args) {

        StringBuffer str=new StringBuffer();
        StringBuffer str1=new StringBuffer("Hello Java");
        StringBuffer str2=new StringBuffer(10);
        StringBuffer str13=new StringBuffer("Hello");

        // Capacity vs length
        System.out.println(str.length());
        System.out.println(str.capacity());

        System.out.println(str1.length());
        System.out.println(str1.capacity());

        System.out.println(str2.length());
        System.out.println(str2.capacity());

        // Append
        // str.add("value");
        // original string get changed
        str1.append("value");
        System.out.println(str1);

        // insert
        // str.insert(index,value)
        str1.insert(2,'x');
        System.out.println(str1);

        // replace
        // str1.replace(start index,end index,value)
        str13.replace(1,3,"java");
        System.out.println(str13);

        //  delete
        // str1.delete(start index, end index)
        str13.delete(1,5);
        System.out.println(str13);

        // reverse
        // str1.reverse()
        str13.reverse();
        System.out.println(str13);


    }

}
