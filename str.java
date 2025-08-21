import java.util.IllegalFormatException;
import java.util.Scanner;
import java.lang.String;

public class str{
    public int count(String s,char cas){
        if(s.isEmpty()|| s.isBlank()) throw new IllegalArgumentException("string cannot be empty or can't contain blank spaces for count");
        switch(cas){
            case 'U'
        }
    }
    public String disp(String s1, String s2){
        return s1.concat(s2);
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the string1 for cancatenation: ");
        String s1=scan.nextLine();
        System.out.print("enter the string2 for cancatenation: ");
        String s2=scan.nextLine();
        if(s1.isEmpty()|| s2.isEmpty()) throw new IllegalArgumentException("empty string cannot be concatenated");
        str s=new str();
        System.out.println("Concatenation of two string: "+s.disp(s1,s2).trim());
        System.out.println("Concatenation using join:"+String.join(s1,s2));
        //ques 2
        String word="String Exercises";
        if(word.isEmpty()||word.isBlank()) throw new IllegalArgumentException("an empty string or a string with blacnk spaces is not valid for checking");
        if(word.contains("x")) {
            System.out.println("'x' is present in the word: "+word);
        }
        else{
            System.out.println("'x' is not present in the word: "+word);
        }
        //ques 3
        System.out.print("enter the string1 to compare: ");
        String str1=scan.nextLine();
        System.out.print("enter the string2 to compare: ");
        String str2=scan.nextLine();
        System.out.print("enter the string1 to compare: ");
        String r1=scan.nextLine().intern();
        System.out.print("enter the string2 to compare: ");
        String r2=scan.nextLine().intern();
        // intern function forces the string to be stored in the string pool so same string hava same references
        System.out.println("comparison of two string using equals() func: "+str1.equals(str2));
        System.out.println("comparison of two string using compareTo() func: "+str1.compareTo(str2));
        System.out.println("comparison of two string using '==' operator func(without using intern()): "+(str1==str2));
        System.out.println("comparison of two string using '==' operator func(with using intern()): "+(r1==r2));
    }
}