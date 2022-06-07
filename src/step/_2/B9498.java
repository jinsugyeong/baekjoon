package step._2;

import java.util.Scanner;

public class B9498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        char result;

        if(score >= 90){
            result = 'A';
        }else if(score < 90 && score >= 80){
            result = 'B';
        }else if(score < 80 && score >= 70){
            result = 'C';
        }else if(score < 70 && score >= 60){
            result = 'D';
        }else {
            result = 'F';
        }

        System.out.println(result);
    }
}
