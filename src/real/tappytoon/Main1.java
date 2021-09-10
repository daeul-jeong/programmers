package real.tappytoon;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

/*문제 설명
    아래 3가지 유형 중 한 가지에 맞춰 휴대폰 번호를 입력받으려 합니다.
    유형 1 : 010-XXXX-XXXX
    유형 2 : 010XXXXXXXX
    유형 3 : +82-10-XXXX-XXXX
    'X'는 0부터 9까지의 숫자 중 하나입니다.

    휴대폰 번호 phone_number가 매개변수로 주어질 때,
    유형 1~3중 어디에 해당하는지 return 하도록 solution 함수를 완성해주세요.
    만약, 어떤 유형에도 해당하지 않는다면 -1을 return 하면 됩니다.

제한 사항
    phone_number는 길이가 1 이상 30 이하인 문자열입니다.
    phone_number는 숫자, '+', '-' 만으로 이루어진 문자열입니다.
*/
public class Main1 {
    @Test
    public void test() {
//        assertThat(solution("+82-*10-3434-2323")).isEqualTo(-1);
        assertThat(solution("01112345678")).isEqualTo(2);
//        assertThat(solution("+82-10-3434-2323")).isEqualTo(3);
//        assertThat(solution("+82-010-3434-2323")).isEqualTo(-1);
//        assertThat(solution("010-1212-333")).isEqualTo(-1);
    }

    public int solution(String phone_number) {
        if (Pattern.matches("^[0-9]*$", phone_number)) {
            String front = phone_number.substring(0, 3);
            if (phone_number.length() == 11) {
                if(!front.equalsIgnoreCase("010")){
                    return -1;
                }
                return 2;
            }
        }
        if (Pattern.matches("^(010-)\\d{4}([-])\\d{4}$", phone_number)) {
            return 1;
        }
        if (Pattern.matches("^(\\+82-10-)\\d{4}([-])\\d{4}$", phone_number)) {
            return 1;
        }
        return -1;
    }
}
