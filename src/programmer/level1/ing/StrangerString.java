package programmer.level1.ing;

/*
문제 설명
    문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
    각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
    문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
    첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
입출력 예
    s	return
    "try hello world"	"TrY HeLlO WoRlD"
입출력 예 설명
    "try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다.
    각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다.
    따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
*/
public class StrangerString {
    public static void main(String[] args) {
        String result = solution("  aaabbbcc");
        System.out.println(result);
    }

    public static String solution(String s) {
        String new_s = s.replaceAll(" ", "_");
        System.out.println(new_s);
        StringBuilder sb = new StringBuilder();
        String[] newArr = new_s.split("", -1);
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i].equalsIgnoreCase("_")){
                sb.append(" ");
                continue;
            }
            if (i % 2 == 0) {
                sb.append(newArr[i].toUpperCase());
            } else {
                sb.append(newArr[i].toLowerCase());
            }
        }
        return sb.toString();
    }

//    public static String solution(String s) {
//        String[] words = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            String[] charArr = word.split("");
//            for (int j = 0; j < charArr.length; j++) {
//                if (j % 2 == 0) {
//                    sb.append(charArr[j].toUpperCase());
//                } else {
//                    sb.append(charArr[j].toLowerCase());
//                }
//            }
//            sb.append(" ");
//        }
//        return sb.toString().trim();
//    }
}
