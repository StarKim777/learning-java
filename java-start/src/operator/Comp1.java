package operator;

public class Comp1 {
    public static void main(String[] args) {
        String s1 = "안녕1";
        String s2 = "안녕2";

        boolean b1 = "hello".equals("hello");
        boolean b2 = s1.equals(s2);
        boolean b3 = s1.equals("안녕1");
        boolean b4 = s1 == s2;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        

        //true
        //false
        //true
        //false

    }
}
