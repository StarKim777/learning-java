package select;

public class CaseTest {
    public static void main(String[] args) {
        int grade = 60;
        switch (grade){
            case 100:
                System.out.println("A");
                break;
            case 90:
                System.out.println("B");
                break;
            case 80:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
        }
    }

}
