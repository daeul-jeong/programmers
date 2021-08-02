package programmer.level1;

public class GetMiddleStringMain {
    public static void main(String[] args) {
        String answer = solution("1234");
        if(!answer.equalsIgnoreCase("23")){
            System.out.println("1틀림");
        }

        answer = solution("12345");
        if(!answer.equalsIgnoreCase("3")){
            System.out.println("2틀림");
        }

        answer = solution("1");
        if(!answer.equalsIgnoreCase("1")){
            System.out.println("3틀림");
        }
        answer = solution("aaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbbaaaaaaaaaabbbbbbbbbb");
        System.out.println(answer);

    }

    private static String solution(String s) {
        String answer = "";
        int middleIndex = Math.round(s.length() / 2);
        if(s.length() % 2 == 0){
            return s.substring(middleIndex - 1, middleIndex +1);
        }
        return String.valueOf(s.charAt(middleIndex));
    }
}
