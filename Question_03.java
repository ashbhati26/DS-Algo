import java.util.*;
public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number1[] = {23, 74, 18, 41, 22, 20};
        Arrays.sort(number1, Collections.reverseOrder());
        System.out.println("Descending order of an array: " + Arrays.toString(number1));
        System.out.print("Enter the max element of array you want to find : ");
        int kthMAX = sc.nextInt();
        System.out.println(kthMAX + " maximum element of an array is : " + number1[kthMAX - 1]);
        
        
        int number2[] = {23, 74, 18, 41, 22, 20};
        Arrays.sort(number2);
        System.out.println("Ascending order of an array: " + Arrays.toString(number2));
        System.out.print("Enter the min element of array you want to find : ");
        int kthMIN = sc.nextInt();
        System.out.println(kthMIN + " minimum element of an array is " + number2[kthMIN - 1]);
    }
}
