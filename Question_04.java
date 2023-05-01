import java.util.*;
public class Question_04 {
    public static void sort(int arr[]){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while(mid <= high){
            switch(arr[mid]){
                case 0: {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
                break;
                }
                case 1:
                mid++;
                break;
                case 2:{
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 0, 2, 0, 1, 2, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}