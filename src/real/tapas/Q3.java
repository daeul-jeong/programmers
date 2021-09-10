package real.tapas;



import org.junit.Test;

/**
 *아기 돼지 삼형제가 1부터 n까지 번호가 붙어있는 음식을 먹으려고 합니다. 세 돼지 모두 식탐이 강했기 때문에 다음 규칙에 따라 음식을 먹기로 결정했습니다.
 *
 * 첫째 돼지에게는 1번 음식부터 x번 음식까지, 둘째 돼지에게는 x+1번 음식부터 y번 음식까지, 셋째 돼지에게는 y+1번 음식부터 n번 음식까지 분배됩니다(1 ≤ x ＜ y ＜ n).
 * 모든 음식은 정수형태의 만족도 수치를 가지고 있습니다.
 * 각 돼지의 포만도는 각자가 먹은 음식의 만족도 값의 합으로 나타낼 수 있으며, 음식을 모두 먹은 후 세 돼지의 포만도가 모두 같아야 합니다.
 * 모든 돼지는 자신의 음식을 남기지 않고 다 먹습니다.
 * 음식 중에는 만족도가 음수인 음식이 존재할 수 있으며, 만족도가 음수인 음식도 남기지 않고 모두 먹습니다.
 * 음식의 만족도가 저장된 배열 foods 가 매개변수로 주어질 때, 아기 돼지 삼 형제의 포만도가 같아지게 음식을 나누어 주는 방법의 가짓수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * foods는 음식의 만족도가 1번 음식부터 n번 음식까지 순서대로 들어있는 배열입니다.
 * foods에 들어있는 만족도는 -100,000 이상 100,000 이하의 정수입니다.
 * foods에 들어있는 음식의 개수는 500,000개 이하입니다.
 * 정답이 231 - 1 보다 작거나 같은 경우만 입력으로 주어집니다.
 * 입출력 예시
 * foods	result
 * [1,2,3,0,3]	2
 * [4,1]	0
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 다음 두 가지 경우가 가능합니다.
 *
 * 첫째 돼지에게 1번, 2번 음식, 둘째 돼지에게 3번 음식, 셋째 돼지에게 4번, 5번 음식을 나누어 주면 각자의 포만도가 3이 됩니다.
 * 첫째 돼지에게 1번, 2번 음식, 둘째 돼지에게 3번, 4번 음식, 셋째 돼지에게 5번 음식을 나누어 주면 각자의 포만도가 3이 됩니다.
 * 입출력 예 #2
 *
 * 세 마리 돼지에게 공평하게 나눠 줄 방법이 존재하지 않습니다.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class Q3 {
    @Test
    public void main() {
        assertThat(solution(new int[]{1,2,3,0,3})).isEqualTo(2);
//        assertThat(solution(new int[]{4,1})).isEqualTo(0);
    }
    public int solution(int[] foods) {
//        if(foods.length < 3){
//            return 0;
//        }
        List<Integer> foodList = Arrays.stream(foods).boxed().collect(Collectors.toList());
        Map<Integer, Long> dupMap = foodList.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        System.out.println(dupMap);
        Long dup = dupMap.get(0);



        int total = 0;
        for (int i = 0; i < foods.length; i++) {
            total += foods[i];
        }
        int mid = total / 3;

        int check = 0;
        for (int i = 0; i < foods.length; i++) {
            check += foods[i];
            if(check == mid){
                System.out.println("@");
            }
        }


        int a = total % 3;
        if(total % 3 == 0){
            return 0;
        }

        int answer = -1;
        return answer;
    }
}