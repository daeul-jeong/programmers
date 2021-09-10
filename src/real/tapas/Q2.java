package real.tapas;


import org.junit.Test;

/**
 *N명의 학생이 시험을 보았습니다. 각 학생에는 1부터 N까지의 번호가 붙어있습니다. N명의 학생의 시험 점수를 바탕으로 등수를 부여하려고 합니다. 각 학생의 등수는 자신보다 높은 점수를 받은 학생의 수에 1을 더한 수입니다. 예를 들어, 세 학생이 있고 1, 2, 3번 학생의 성적이 각각 2, 2, 1이라면 1, 2번 학생은 가장 점수가 높고 동점이기 때문에 1등이고, 3번 학생은 1, 2번 학생보다 점수가 낮기 때문에 3등입니다.
 * 1번부터 N번 학생까지의 점수가 순서대로 들어있는 배열 grade가 주어질 때 1번부터 N번 학생까지의 등수가 순서대로 들어있는 배열을 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * grade의 길이는 1 이상 1,000,000 이하입니다.
 * grade의 각 원소는 1이상 1,000,000,000 이하입니다.
 * 입출력 예
 * grade	result
 * [2,2,1]	[1,1,3]
 * [3,2,1,2]	[1,2,4,2]
 * 입출력 예 설명
 * 입출력 예 #1
 * 문제 예시와 같습니다.
 *
 * 입출력 예 #2
 * 1번 학생은 가장 점수가 높기 때문에 1등, 2번 학생은 자신보다 높은 점수의 학생이 1번 학생밖에 없으므로 2등, 3번 학생은 자신보다 높은 점수의 학생이 1번, 2번, 4번 학생이기 때문에 4등, 그리고 4번 학생은 2번 학생과 마찬가지로 자신보다 높은 점수의 학생이 1번 학생밖에 없으므로 2등입니다.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class Q2 {
    @Test
    public void main() {
//        assertThat(solution(new int[]{2, 2, 1})).isEqualTo(new int[]{1, 1, 3});
        assertThat(solution(new int[]{3, 2, 1, 2})).isEqualTo(new int[]{1, 2, 4, 2});

    }

//    public int[] solution(int[] grade) {
//        List<Integer> originGradeList = Arrays.stream(grade).boxed().collect(Collectors.toList());
//        List<Integer> sortGradeList = new ArrayList<>();
//        sortGradeList.addAll(originGradeList);
//        Collections.sort(sortGradeList, Collections.reverseOrder());
//        List<Integer> rankList = new ArrayList<>();
//        for (int i = 0; i < originGradeList.size(); i++) {
//            int index = originGradeList.indexOf(sortGradeList.get(i));
//            if (i == originGradeList.size() - 1) {
//                rankList.add(index, originGradeList.size());
//            } else {
//                rankList.add(index, index + 1);
//            }
//        }
//        int[] rankArrays = new int[rankList.size()];
//        for (int i = 0; i < rankList.size(); i++) {
//            rankArrays[i] = rankList.get(i);
//        }
//        return rankArrays;
//    }
    public int[] solution(int[] grade) {
        List<Integer> gradeList = Arrays.stream(grade).boxed().collect(Collectors.toList());
        Integer max = Collections.max(gradeList);
        Integer min = Collections.min(gradeList);

        List<Integer> rankList = new ArrayList<>();
        for (int i = 0; i < gradeList.size(); i++) {
            if (max == gradeList.get(i)) {
                rankList.add(i, 1);
            } else if (min == gradeList.get(i)) {
                rankList.add(i, gradeList.size());
            } else {
                int gap = max - gradeList.get(i);
                rankList.add(i, gap + 1);
            }
        }

        int[] rankArrays = new int[rankList.size()];
        for (int i = 0; i < rankList.size(); i++) {
            rankArrays[i] = rankList.get(i);
        }
        return rankArrays;
    }
}