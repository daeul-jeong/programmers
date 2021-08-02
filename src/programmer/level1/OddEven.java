package programmer.level1;

public class OddEven {
    /*
    * 제한 조건
        num은 int 범위의 정수입니다.
        0은 짝수입니다.
      입출력 예
        num	return
        3	"Odd"
        4	"Even"
* */
    public static void main(String[] args) {
        solution(3);
    }

    public static String solution(int num) {
        if(num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }
}
