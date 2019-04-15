import java.util.*;

public class MainTest{
    public static void main(String[] args) {
        Random rand = new Random();
        
        int data1[] = generate(rand, 10, 100);
        Main.bubbleSort(data1);
        if(validate(data1)){
            System.out.println("Bubble Sort Test Passed");
        } else {
            System.out.println("Bubble Sort Test Failed");
        }

        int data2[] = generate(rand, 10, 100);
        Main.insertionsort(data2);
        if(validate(data2)){
            System.out.println("Insertion Sort Test Passed");
        } else {
            System.out.println("Insertion Sort Test Failed");
        }

        int data3[] = generate(rand, 10, 100);
        Main.mergesort(data3);
        if(validate(data3)){
            System.out.println("Merge Sort Test Passed");
        } else {
            System.out.println("Merge Sort Test Failed");
        }

        int data4[] = generate(rand, 10, 100);
        Main.quicksort(data4);
        if(validate(data4)){
            System.out.println("Quick Sort Test Passed");
        } else {
            System.out.println("Quick Sort Test Failed");
        }

        int data5[] = generate(rand, 10, 100);
        Main.selectionsort(data5);
        if(validate(data5)){
            System.out.println("Selection Sort Test Passed");
        } else {
            System.out.println("Selection Sort Test Failed");
        }
    }

    public static int[] generate(Random r, int size, int max){
        int arr [] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = r.nextInt(max);
        }
        return arr;
    }

        /* Prints the array */
    public static void printArray(int arr[]) 
    { 
            int n = arr.length; 
            for (int i=0; i<n; ++i) 
                System.out.print(arr[i] + " "); 
            System.out.println("\n"); 
    } 

    public static boolean validate(int arr[]){
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}