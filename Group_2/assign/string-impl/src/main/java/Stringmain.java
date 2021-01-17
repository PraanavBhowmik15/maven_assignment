import java.util.Scanner;
public class Stringmain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        StringFunction rev=new StringFunction();
        rev.reverse(s);
        rev.count(s);
        sc.close();
    }
}
