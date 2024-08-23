package operator;

public class Operator3
{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int c = 10;
        int d = 0;
        System.out.println(a);

        b = a++;
        System.out.println("a = " + a + ",b = " + b );

        d = ++c;
        System.out.println("c = " + c + ",d = " + d );
    }
}
