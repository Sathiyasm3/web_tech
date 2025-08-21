import java.util.Scanner;

public class str{
    public String disp(String s1, String s2){
        return s1+s2;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the string1 for cancatenation: ");
        String s1=scan.nextLine();
        System.out.print("enter the string2 for cancatenation: ");
        String s2=scan.nextLine();
        str s=new str();
        System.out.println("Cancatenation of two string: "+s.disp(s1,s2));
    }
}