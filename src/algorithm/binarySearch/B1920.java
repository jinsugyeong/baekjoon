package algorithm.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class B1920 {

    static int[] nArr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        nArr = new int[n];
        for(int i=0; i<n; i++){
            nArr[i] = sc.nextInt();
        }
        Arrays.sort(nArr);

        int m = sc.nextInt();
        int input[] = new int[m];
        for(int i=0; i<m; i++){
            input[i] = sc.nextInt();

            if(search(input[i], nArr)) System.out.println(1);
            else System.out.println(0);
        }
    }

    public static boolean search(int num, int[] arr){

        int left = 0;
        int right = nArr.length -1;
        int mid;

        while(left <= right){
            mid = (left + right) / 2;

            if(num < arr[mid]) right = mid - 1;
            else if(num > arr[mid]) left = mid + 1;
            else return true;
        }


        return false;
    }


    
}
