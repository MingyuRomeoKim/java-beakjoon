package src.problem;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
 * 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
 */

public class Problem10699 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");

        System.out.println(dateFormat.format(date));
    }
}
