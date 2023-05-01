import java.util.*;
public class Question_03a {
    public static void Element(Integer number[]){ 
        Scanner sc = new Scanner(System.in);
        Arrays.sort(number, Collections.reverseOrder()); //sort in descending order
        System.out.println("Descending order of an array: " + Arrays.toString(number));
        System.out.print("Enter the max element of array you want to find : ");
        int kthMAX = sc.nextInt();
        System.out.println(kthMAX + " maximum element of an array is : " + number[kthMAX - 1]);
        Arrays.sort(number); // sort in ascending order
        System.out.println("Ascending order of an array: " + Arrays.toString(number));
        System.out.print("Enter the min element of array you want to find : ");
        int kthMIN = sc.nextInt();
        System.out.println(kthMIN + " minimum element of an array is " + number[kthMIN - 1]);
    }
    public static void main(String[] args) {
        Integer number[] = {23, 74, 18, 41, 22, 20};
        Element(number);
    }
}