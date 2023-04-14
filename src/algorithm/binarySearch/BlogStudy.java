package algorithm.binarySearch;

public class BlogStudy {
    static int[] arr;
    public static void main(String[] args) {
        //1. 반복문으로 구현
        arr = new int[]{4, 1, 5, 2, 3};
        int n = 5;

        System.out.println(binarySearch(n));

    }

    public static int binarySearch(int num){
        int result = 0;

        int left = 0;
        int right = arr.length - 1;
        int mid;

        while(left <= right){
            mid = (left + right) / 2;

            if(num == arr[mid]){
                result = mid;
                break;
            }else if(num > arr[mid]){
                left = mid+1;
            }else if(num < arr[mid]){
                right = mid - 1;
            }
        }

        return result;
    }
}
