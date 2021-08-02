package programmer.level1.complete;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*문제 설명
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
    n은 10,000,000,000이하인 자연수입니다.
입출력 예
    n	return
    12345	[5,4,3,2,1]
*/
public class FlipNaturalNum {
    @Test
    public void main(){
        Integer[] exception = {0,0,0,0,0,0,0,0,0,0,1};
        //10000000000
        //9999999999
        assertThat(solution(10000000000L)).containsExactly(exception);
    }

    public Integer[] solution(long n) {
        String[] split = String.valueOf(n).split("");
        Integer[] result = new Integer[split.length];
        int j = 0;
        for (int i = split.length - 1; i >= 0; i--) {
            result[j] = Integer.valueOf(split[i]);
            j++;
        }
        return result;
    }
}
