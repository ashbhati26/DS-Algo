import java.util.*;
public class Question_02 {
    public static void main(String[] args) {
        Integer numbers[] = {23, 74, 18, 41, 22, 20};
        Arrays.sort(numbers);
        System.out.println("The given is arranged in ascending order : " + Arrays.toString(numbers));
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Smallest element: " + numbers[0]);
        System.out.println("Largest element: " + numbers[numbers.length-1]);
    }   
}
