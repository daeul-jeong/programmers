package programmer.level1;

import java.util.*;

public class PickTwoNumberAdd {
    public static void main(String[] args) {
        int array[] = {2, 1, 3, 4, 1};
        int result[] = solution(array);
        System.out.println(result);
    }

    public static int[] solution(int[] numbers) {
        int start = 0;
        int move = 0;
        Set<Integer> addResult = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            start = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if(i != j){
                    move = numbers[j];
                    addResult.add(start + move);
                }
            }
        }
        List<Integer> addList = new ArrayList<Integer>(addResult);
        Collections.sort(addList);

        int[] intArray = new int[addList.size()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = addList.get(i);
        }
        return intArray;
    }
}
