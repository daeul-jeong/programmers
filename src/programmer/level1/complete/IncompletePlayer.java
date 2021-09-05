package programmer.level1.complete;

import org.junit.Test;

/**
 *문제 설명
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 *
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 */

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class IncompletePlayer {
    @Test
    public void main() {
        assertThat(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"})).isEqualTo("leo");
        assertThat(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"})).isEqualTo("vinko");
        assertThat(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"})).isEqualTo("mislav");
        assertThat(solution(new String[]{"ana"}, new String[]{})).isEqualTo("ana");
        assertThat(solution(new String[]{"mislav", "mislav", "mislav", "stanko"}, new String[]{"mislav", "mislav", "mislav"})).isEqualTo("stanko");
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<String, Integer>();
        for (int i = 0; i < participant.length; i++) {
            int cnt = participantMap.getOrDefault(participant[i], 0);
            if (cnt > 0) {
                participantMap.put(participant[i], participantMap.get(participant[i]) + 1);
            } else {
                participantMap.put(participant[i], 1);
            }
        }
        for (int i = 0; i < completion.length; i++) {
            int cnt = participantMap.get(completion[i]);
            if (cnt > 0) {
                participantMap.put(completion[i], cnt - 1);
            }
        }
        for (Map.Entry<String, Integer> item : participantMap.entrySet()) {
            if (0 < item.getValue())
                return item.getKey();
        }

        return null;
    }

//    public String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for (int i = 0; i < completion.length; i++) {
//            if (participant[i] != completion[i])
//                return participant[i];
//        }
//        return participant[participant.length - 1];
//    }

//    public String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        Set<String> participantSet = new HashSet<String>();
//        List<String> duplicateList = new ArrayList<String>();
//        for (int i = 0; i < participant.length; i++) {
//            if (participantSet.add(participant[i]) == false) {
//                duplicateList.add(participant[i]);
//            }
//        }
//        Set<String> completionSet = new HashSet<String>(Arrays.asList(completion));
//        participantSet.removeAll(completionSet);
//        if (participantSet.size() == 0) {
//            return duplicateList.get(0);
//        }
//        return participantSet.stream().findFirst().get();
//    }
}
