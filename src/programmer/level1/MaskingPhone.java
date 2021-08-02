package programmer.level1;

import com.apple.eawt.AppEvent;

public class MaskingPhone {

    /*전화번호가 문자열 phone_number로 주어졌을 때,
    전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
    제한 조건
    s는 길이 4 이상, 20이하인 문자열입니다.*/
    public static void main(String[] args) {
        String answer = solution("01033334444");
        if(!answer.equalsIgnoreCase("*******4444")){
            System.out.println("1틀림");
        }
        answer = solution("027778888");
        if(!answer.equalsIgnoreCase("*****8888")){
            System.out.println("2틀림");
        }

        answer = solution("8888");
        if(!answer.equalsIgnoreCase("8888")){
            System.out.println("2틀림");
        }
    }

    public static String solution(String phone_number) {
        String answer = "";
        int index = phone_number.length() - 5;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            sb.append("*");
        }
        String lastNumber = phone_number.substring(index + 1, phone_number.length());
        return sb.toString() +lastNumber;
    }
}
