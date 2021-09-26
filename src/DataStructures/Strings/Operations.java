package DataStructures.Strings;

import java.util.Arrays;
import java.util.Locale;

public class Operations {

    public static void main(String[] args) {

        String s1="Hello World";
        String s11="Hello World";
        String s111="Hello Java";
        String s1111="Hello world";
        String s2="Java";
        String s3="jav";
        String up="hLskas";
        String down="saKSLLSa";
        String trim="      saKSLL    Sa              ";
        String split="A B : C : D : E";


        // "" used for strings
        // '' used for char

        //Length of string
        //str.length()
        //Counts space also
        System.out.println(s1.length());
        System.out.println(s2.length());

        // isEmpty() - returns true or false
        System.out.println(s1.isEmpty());

        //Join two strings
        //s1.concat(second)
        System.out.println(s1.concat(s2));

        //Compare two Strings
        //return true if equals
        //             else return false
        //It is case sensitive
        System.out.println(s2.equals(s3));

        //Char at certain position
        //s1.charAt();
        // if space is at position it doesn't printDFS anything
        System.out.println(s1.charAt(6));

        //Substring
        //String.substring(Start Index)
        //String.substring(Start Index,End Index)
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,6));

        //To Uppercase / lowercase
        // str.toUpperCase();
        // str.toLowerCase();
        System.out.println(up.toUpperCase());
        System.out.println(down.toLowerCase());

        //Replace
        // str.replace(old text , new text)
        //It is case sensitive
        System.out.println(s1.replace('L','z'));

        //index of
        // return the first index of string or char
        // s1.indexOf(char)
        // s1.indexOf(char,stat Index);
        // case sensitive
        // return -1 if index not found
        System.out.println(s1.indexOf('z'));
        System.out.println(s1.indexOf('l',6));

        //Compare to - compare two strings
        // s1.compareTo(s12)
        // return 0 if equals
        // return -ve if s1 comes in dictionary first
        // return +ve if s1 comes in dictionary last
        //It is case sensitive
        System.out.println(s1.compareTo(s11));
        System.out.println(s1.compareToIgnoreCase(s1111));

        //trim
        // str.trim();
        // trims the leading and trailing whitespace
        // doesn't affect the space in between
        System.out.println(trim.trim());

        //split - used to split the spring at specified regex and returns an array of substring
        // it can also be used with index
        System.out.println(Arrays.toString(split.split(":")));

        //toCharArray() - used to convert string to char array
        System.out.println(down.toCharArray());

        // Arrays to string - used to convert arrays to string
        System.out.println(Arrays.toString(split.split(":")));

    }
}
