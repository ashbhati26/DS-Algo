import java.util.*;
public class Question_10 {
    public static int jump(int arr[]){
        int jump = 0;
        int position = 0;
        int destination = 0;
        for(int i = 0; i < arr.length-1; i++){
            destination = Math.max(destination, arr[i] + 1);
                if(position == i){
                    position = destination;
                    jump++;
                }
        }
        return jump;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.print("Minimum Jumps Required : " + jump(arr));
    }
}
