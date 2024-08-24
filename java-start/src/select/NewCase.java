package select;

public class NewCase {
    public static void main(String[] args) {
        int grade = 100;
        int coupon = switch (grade){
            case 100 -> 10;
            case 80 -> 5;
            default -> 0;
        };
        System.out.println("coupon : "+coupon + " $");
    }
}
