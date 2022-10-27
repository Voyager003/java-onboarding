package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 구현 기능 목록
 * 1. number를 인자로 받아 박수 cnt를 하는 기능 구현
 */
public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        handclap(number);
        return answer;
    }
    static final List<Integer> threesixnine = List.of(3, 6, 9);
    public static int handclap(int num){
        int cnt = 0;
        while(true){
            if(num<=0){
                return cnt;
            }
            if(threesixnine.contains(num%10)){
                cnt++;
            }
            num = num/10;
        }
    }
}
