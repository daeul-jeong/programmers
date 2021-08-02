package programmer.level1.complete;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
/*
문제 설명
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
    str은 길이 1 이상인 문자열입니다.
입출력 예
    s	return
    "Zbcdefg"	"gfedcbZ"
*/
public class StringDesc {
    @Test
    public void main(){
        assertThat(solution("Zbcdefg")).isEqualTo("gfedcbZ");
    }
    public String solution(String s) {
        String[] split = s.split("");
        List<Integer> ascii = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            char character = split[i].charAt(0);
            ascii.add((int) character);
        }
        Collections.sort(ascii, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i: ascii) {
            sb.append(Character.toString((char) i));
        }
        return sb.toString();
    }
}
