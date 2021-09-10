package real.tappytoon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class Main2 {
    @Test
    public void test() {
        assertThat(solution(2322)).isEqualTo(2);
        assertThat(solution(1234)).isEqualTo(2);
    }

    public int solution(long n) {
        int answer = 0;
        String[] inputs = String.valueOf(n).split("");
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < inputs.length; i++) {
            if(inputs[i].equalsIgnoreCase("0")){
                continue;
            }
            integerSet.add(Integer.valueOf(inputs[i]));
        }
        List<Integer> integerList = new ArrayList<>(integerSet);
        for (int i = 0; i < integerList.size(); i++) {
            if (n % integerList.get(i) == 0) {
                ++answer;
            }
        }
        return answer;
    }
}
