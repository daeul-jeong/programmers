package programmer.level1.tappytoon;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class Main5 {
    @Test
    public void test() {
        assertThat(solution(new int[]{2, 1, 3, 1, 4, 2, 1,  1000000000})).isEqualTo(2);
        assertThat(solution(new int[]{1, 2, 3})).isEqualTo(-1);
    }

    public Long solution(int[] arr) {
        Set<Long> keySet = new HashSet<>();
        List<Long> keyList = new ArrayList<>(keySet);
        for (int i = 0; i < arr.length; i++) {
            if (keySet.add(Long.valueOf(arr[i]))) {
                keyList.add(Long.valueOf(arr[i]));
            }
        }
        if (keySet.size() == arr.length) {
            return -1L;
        }
        List<Long> gapList = new ArrayList<>();
        for (int i = 0; i < keyList.size(); i++) {
            Long key = keyList.get(i);
            List<Long> frontRear = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == key) {
                    if (frontRear.size() == 0) {
                        frontRear.add(Long.valueOf(j));
                        continue;
                    }
                    if (frontRear.size() == 1) {
                        frontRear.add(Long.valueOf(j));
                        break;
                    }
                }
            }
            if (frontRear.size() == 2) {
                Long gap = frontRear.get(1) - frontRear.get(0);
                gapList.add(gap);
            }

        }
        return Collections.min(gapList);
    }
}
