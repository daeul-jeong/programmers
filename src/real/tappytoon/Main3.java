package real.tappytoon;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class Main3 {
    @Test
    public void test(){
//        assertThat(solution(1987)).isEqualTo(2013);
//        assertThat(solution(1000)).isEqualTo(1023);
        assertThat(solution(10000)).isEqualTo(1023);
    }
    public int solution(int p) {
        int answer = 0;
        for (int i = p + 1; i < 100000 ; i++) {
            String input = String.valueOf(i);
            Set<String> targetSet = new HashSet<String>(Arrays.asList(input.split("")));
            if(targetSet.size() == Arrays.asList(input.split("")).size()){
                return i;
            }
        }
        return answer;
    }
}
