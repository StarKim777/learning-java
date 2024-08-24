package select.ex;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 85;
        String grade;
        if(score >= 90){
            grade = "A";
        } else if (score >= 80 ) {
            grade = "B";
        } else if (score >= 70 ) {
            grade = "B";
        } else if (score >= 60 ) {
            grade = "B";
        } else {
            grade = "F";
        }
        System.out.println("학점은 "+grade+"입니다.");


    }
}
