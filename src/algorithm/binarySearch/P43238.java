package algorithm.binarySearch;

import java.util.Arrays;
import java.util.Collections;

public class P43238 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};

        System.out.println(solution(n, times));
    }
    public static long solution(int n, int[] times) {
        long answer = 0;

        Arrays.sort(times);

        long left = 1;
        long right = times[times.length - 1]*n;
        long mid;
        long sum;

        while(left <= right){
            sum = 0;
            mid = (left + right) / 2;

            for(int time : times){
                sum += mid / time;
            }

            if(sum >= n){
                answer = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return answer;
    }
}
