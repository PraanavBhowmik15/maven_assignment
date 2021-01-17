
public class StringFunction{
    public void reverse(String s){
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(s);

        // reverse StringBuilder input1
        input1.reverse();
        System.out.println(input1);
    }
    public void count(String s){
        int l=s.length();
        System.out.println(l);
    }
}