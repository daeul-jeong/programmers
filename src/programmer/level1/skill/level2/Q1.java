package programmer.level1.skill.level2;


import org.junit.Test;

/**
 *소스 파일 저장소에 저장된 파일명은 100 글자 이내로,
 * 영문 대소문자, 숫자, 공백(" "), 마침표("."), 빼기 부호("-")만으로 이루어져 있다.
 * 파일명은 영문자로 시작하며, 숫자를 하나 이상 포함하고 있다.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class Q1 {
    @Test
    public void main() {
        assertThat(solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})).isEqualTo(new String[]{"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"});
//        assertThat(solution(new String[]{"foo010bar020.zip"})).isEqualTo(new String[]{"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"});
    }

    public String[] solution(String[] files) {
        Map<String, Map<String, Map<String, Integer>>> fileScoreMap = setDefaultMap(files);

//        for (Map.Entry<String, Map<String, Map<String, Integer>>> entrySet : fileScoreMap.entrySet()) {
//            System.out.println(entrySet);
//        }

        for (String key : fileScoreMap.keySet()) {
            Map<String, Map<String, Integer>> keyMap = fileScoreMap.get(key);
            Map<String, Integer> head = keyMap.get("head");
            Map<String, Integer> number = keyMap.get("number");
        }
        String[] answer = {};


        return answer;
    }

    private Map<String, Map<String, Map<String, Integer>>> setDefaultMap(String[] files) {
        Map<String, Map<String, Map<String, Integer>>> fileScoreMap = new HashMap<>();
        Pattern p = Pattern.compile("([0-9])+");
        for (String file : files) {
            Map<String, Map<String, Integer>> keyMap = new HashMap<>();
            fileScoreMap.put(file, keyMap);
            Matcher m = p.matcher(file);
            while (m.find()) {
                String[] splits = file.split(m.group());
                Map<String, Integer> valueScore = new HashMap<>();

                valueScore.put(splits[0], 0);
                keyMap.put("head", valueScore);
                valueScore = new HashMap<>();
                valueScore.put(m.group(), 0);
                keyMap.put("number", valueScore);
                valueScore = new HashMap<>();
                valueScore.put(splits[1], 0);
                keyMap.put("tail", valueScore);
                fileScoreMap.put(file, keyMap);
                break;
            }
        }
        return fileScoreMap;
    }
}
