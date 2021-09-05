package programmer.level1.complete;

import org.junit.Test;

/**
 *문제 설명
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 *
 * 구조대 : 119
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 *  phone_book의 길이는 1 이상 1,000,000 이하입니다.
 *  각 전화번호의 길이는 1 이상 20 이하입니다.
 *  같은 전화번호가 중복해서 들어있지 않습니다.
 * 입출력 예제
 *  phone_book	                        return
 *  ["119", "97674223", "1195524421"]	false
 *  ["123","456","789"]	                true
 *  ["12","123","1235","567","88"]	    false
 */

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneList {
    @Test
    public void main() {
        assertThat(solution(new String[]{"119", "97674223", "1195524421"})).isEqualTo(false);
//        assertThat(solution(new String[]{"123", "456", "789"})).isEqualTo(true);
//        assertThat(solution(new String[]{"12", "123", "1235", "567", "88"})).isEqualTo(false);
//        assertThat(solution(new String[]{"1195524421", "119", "97674223"})).isEqualTo(false);
//        assertThat(solution(new String[]{"1195524421", "34", "2134", "314", "1234"})).isEqualTo(true);
    }

    public boolean solution(String[] phone_book) {
        List<String> stringList = Arrays.asList(phone_book);
        Collections.sort(stringList);
        for (int i = 0; i < stringList.size() - 1; i++) {
            String front = stringList.get(i);
            String rear = stringList.get(i + 1);
            if (front.length() > rear.length()) {
                continue;
            }
            String subs = rear.substring(0, front.length());
            if (subs.equalsIgnoreCase(front)) {
                return false;
            }
        }
        return true;
    }
//    public boolean solution(String[] phone_book) {
//        Map<Integer, List<String>> map = new HashMap<>();
//        for (int i = 0; i < phone_book.length; i++) {
//            List<String> v = map.getOrDefault(phone_book[i].length(), new ArrayList<>());
//            v.add(phone_book[i]);
//            map.put(phone_book[i].length(), v);
//
//        }
//        List<String> total = new ArrayList<>();
//        for (Map.Entry<Integer, List<String>> item : map.entrySet()) {
//            List<String> v = item.getValue();
//            total.addAll(v);
//        }
//        Collections.sort(total);
//        for (int i = 0; i < total.size() - 1; i++) {
//            String flag = total.get(i);
//            for (int j = i + 1; j < total.size(); j++) {
//                String compare = total.get(j);
//                String subs = compare.substring(0, flag.length());
//                if(subs.equalsIgnoreCase(flag)){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
}