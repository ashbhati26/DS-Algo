import java.util.*;
// Find union and intersection of two sorted array
public class Question_06 {
    public static void union(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            // skip duplicate
            while(i < arr1.length-1 && arr1[i] == arr1[i+1]){
            i++;
            }
            while(j < arr2.length-1 && arr2[j] == arr2[j+1]){
                j++;
            }
            // comparision 
            if(arr1[i] < arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if(arr1[i] > arr2[j]){
                    System.out.print(arr2[j] + " ");
                    j++;
                }
            else{
                    System.out.print(arr1[i] + " ");
                j++;
                i++;
            }
        }
        // print remaining element of arr1 
        while (i < arr1.length){
            System.out.print(arr1[i] + " ");
            i++;
        }
        // print remaining element of arr2
        while(j < arr2.length){
            System.out.println(arr2[j] + " ");
            j++;
        }
    }
    public static void intersection(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        while(i < arr1.length & j < arr2.length){
            // skip duplicates
            while(i < arr1.length-1 && arr1[i] == arr1[i+1]){
                i++;
                }
            while(j < arr2.length-1 && arr2[j] == arr2[j+1]){
                    j++;
                }
            // comparision
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] < arr1[i]){
                    j++;
            }
            else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 1, 1, 2, 2, 3, 3, 3};
        int arr2[] = {3, 3, 3, 4};
        System.out.print("Union : ");
        union(arr1, arr2);

        System.out.print("Intersection : ");
        intersection(arr1, arr2);
    }
}
