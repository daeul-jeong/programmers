package programmer.level1;

public class BasicStringHandler {
    /*  문자열 s의 길이가 4 혹은 6이고,
        숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.

        예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

        제한 사항
            s는 길이 1 이상, 길이 8 이하인 문자열입니다.
        입출력 예
            s	return
            "a234"	false
            "1234"	true
    */
    public static void main(String[] args) {
        boolean result = solution("a234");
        if (result == false) {
            System.out.println("1맞음");
        }

        result = solution("1234");
        if (result == true) {
            System.out.println("2맞음");
        }

        result = solution("0 1");
        if (result == true) {
            System.out.println("3맞음");
        }

        result = solution("0.1");
        if (result == false) {
            System.out.println("3맞음");
        }

    }

    public static boolean solution(String s) {
        try {
            Integer.valueOf(s);
        } catch (Exception e) {
            return false;
        }
        if (s.length() == 4 || s.length() == 6) {
            return true;
        }
        return false;
    }
}
