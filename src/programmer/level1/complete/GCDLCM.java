package programmer.level1.complete;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/*문제 설명
    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
    두 수는 1이상 1000000 이하의 자연수입니다.
입출력 예
    n	m	return
    3	12	[3, 12]
    2	5	[1, 10]
입출력 예 #2
    자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
* */
public class GCDLCM {
    @Test
    public void main() {
        assertThat(solution(3, 12)).containsExactly(new int[]{3, 12});
        assertThat(solution(2, 5)).containsExactly(new int[]{1, 10});
        assertThat(solution(5, 5)).containsExactly(new int[]{5, 5});
        assertThat(solution(1, 999999)).containsExactly(new int[]{1, 999999});
    }

    public int[] solution(int n, int m) {
        BigInteger b1 = BigInteger.valueOf(n);
        BigInteger b2 = BigInteger.valueOf(m);
        int gcd = b1.gcd(b2).intValue();
        return new int[]{gcd, (n * m) / gcd};
    }
}
