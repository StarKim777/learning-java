package select.ex;

public class CondEx2 {
    public static void main(String[] args) {
        int distance = 150;
        String veh;
        if (distance <= 1){
            veh = "도보";
        } else if (distance <= 10) {
            veh = "자전거";
        } else if (distance <= 100) {
            veh = "자동차";
        } else{
            veh = "비행기";
        }

        System.out.println(veh+"를 이용하세요.");


    }
}
