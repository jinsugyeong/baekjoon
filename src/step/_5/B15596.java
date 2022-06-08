package step._5;

public class B15596 {
    public static void main(String[] args) {
        int[] arr = {1 ,2,3,4,5};
        long re = sum(arr);
        System.out.println(re);
    }
    static long sum(int[] a) {
        long ans = 0;

        for(int num : a){
            ans += num;
        }

        return ans;
    }
}