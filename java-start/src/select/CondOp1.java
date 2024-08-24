package select;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status1;
        String status2;

        if (age >= 18){
            status1 = "성인";
        }
        else{
            status1 = "미성년자";
        }
        System.out.println("당신은 "+status1+"입니다.");

        status2 = (age >= 18) ? "성인" : "미성년자";
        System.out.println("당신은 "+status2+"입니다.");
    }
}
