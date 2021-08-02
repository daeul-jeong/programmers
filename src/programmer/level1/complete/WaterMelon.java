package programmer.level1.complete;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
* 문제 설명
    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
    n은 길이 10,000이하인 자연수입니다.
*/
public class WaterMelon {
    @Test
    public void test() {
        assertThat(solution(3)).isEqualTo("수박수");
        assertThat(solution(4)).isEqualTo("수박수박");
    }

    public String solution(int n) {
        String answer = "";
        double index = Math.ceil(Double.valueOf(n) / 2);
        for (int i = 0; i < index; i++) {
            answer += "수박";
        }
        if (n % 2 != 0) {
            return answer.substring(0, answer.length() - 1);
        }
        return answer;
    }
}
