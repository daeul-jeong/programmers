package programmer.level1.complete;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*문제 설명
    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
제한 조건
    공백은 아무리 밀어도 공백입니다.
    s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    s의 길이는 8000이하입니다.
    n은 1 이상, 25이하인 자연수입니다.
입출력 예
    s	    n	result
    "AB"	1	"BC"
    "z"	    1	"a"
    "a B z"	4	"e F d"
* */
public class CaesarCipher {
    @Test
    public void main() {
//        assertThat(solution("AB", 1)).isEqualTo("BC");
//        assertThat(solution("z", 1)).isEqualTo("a");
//        assertThat(solution("a B z", 4)).isEqualTo("e F d");
//        assertThat(solution("Z", 1)).isEqualTo("A");
//        assertThat(solution("Z", 25)).isEqualTo("Y");
        assertThat(solution("Z", 2)).isEqualTo("B");
        assertThat(solution("z", 3)).isEqualTo("c");
    }

    public String solution(String s, int n) {
        String[] strings = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            int ascii = strings[i].charAt(0);
            if (ascii == 32) {
                sb.append(" ");
                continue;
            }
            if (65 <= ascii && ascii <= 90) {
                int result = ascii + n;
                if (result > 90) {
                    int temp = (result - 90);
                    int gap = 64 + temp;
                    sb.append((char) gap);
                    continue;
                } else {
                    sb.append((char) result);
                    continue;
                }
            }
            if (97 <= ascii && ascii <= 122) {
                int result = ascii + n;
                if (result > 122) {
                    int temp = (result - 122);
                    int gap = 96 + temp;
                    sb.append((char) gap);
                    continue;
                } else {
                    sb.append((char) result);
                    continue;
                }
            }
        }
        return sb.toString();
    }
}
