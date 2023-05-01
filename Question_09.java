import java.util.*;
public class Question_09 {
    public static int getMINDiff(int arr[], int k){
        Arrays.sort(arr);
        int ans = arr[arr.length-1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[arr.length-1] - k;
        for(int i = 0; i < arr.length-1; i++){
            int min = Math.min(smallest, arr[i+1] - k);
            int max = Math.max(largest, arr[i] + k);
            if(min < 0){
                continue;
            }
            ans = Math.min(ans, max-min);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 15, 10};
        int k = 3; //given
        System.out.println(getMINDiff(arr, k));
    }
}