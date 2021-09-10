package real.tappytoon;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Main4 {

    @Test
    public void test() {
//        assertThat(solution("hellopython",
//                "abcdefghijk",
//                0)).
//                isEqualTo("igoptvfbqyy");
//
//        assertThat(solution("hellopython",
//                "abcdefghijk",
//                1)).
//                isEqualTo("yigoptvfbqy");
//
//        assertThat(solution("hellopython",
//                "abcdefghijk",
//                2)).
//                isEqualTo("yyigoptvfbq");
//
//        assertThat(solution("hellopython",
//                "abcdefghijk",
//                3)).
//                isEqualTo("qyyigoptvfb");


        assertThat(solution("qyyigoptvfb",
                "abcdefghijk",
                3)).
                isEqualTo("hellopython");

    }

    public String solution(String encrypted_text, String key, int rotation) {
        String[] keyStrArrs = key.split("");
        List<Integer> keyList = new ArrayList<>();
        for (int i = 0; i < keyStrArrs.length; i++) {
            int ascii = keyStrArrs[i].charAt(0);
            int keyInt = ascii - 96;
            keyList.add(keyInt);
        }
        String[] plainTexts = encrypted_text.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainTexts.length; i++) {
            int ascii = plainTexts[i].charAt(0);
            int newAscii = ascii + keyList.get(i);
            if (newAscii > 122) {
                int gap = newAscii - 122;
                newAscii = 96 + gap;
            }
            sb.append((char) newAscii);
        }

        if (rotation == 0) {
            return sb.toString();
        } else if (rotation < 0) {
            return leftRoate(sb.toString(), rotation);
        } else {
            return rightRotate(sb.toString(), rotation);
        }

    }

    String leftRoate(String str, int d) {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    // function that rotates s towards right by d
    String rightRotate(String str, int d) {
        return leftRoate(str, str.length() - d);
    }
}
