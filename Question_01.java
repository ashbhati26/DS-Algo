import java.util.Arrays;
class Question_01{
    public static void reverseArray(int numbers[]){
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {23, 74, 18, 41, 22, 20};
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}