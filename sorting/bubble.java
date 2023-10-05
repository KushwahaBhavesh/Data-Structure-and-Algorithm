import java.util.Scanner;

public class bubble {
    public static void bubblesort(int[] arr) {
        // bubble sort algorithm
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } 
        }

        // Display Sorted Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int size = 0;
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        // creating Arry
        int[] array = new int[size];
        System.out.print("ArryaData:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Sorted Array:");
       bubblesort(array);
    }
}



/*
Time Complexity: O(N2)
Auxiliary Space: O(1) 


Advantages of Bubble Sort:
Bubble sort is easy to understand and implement.
It does not require any additional memory space.
It is a stable sorting algorithm, meaning that elements with the same key value maintain their relative order in the sorted output.


Disadvantages of Bubble Sort:
Bubble sort has a time complexity of O(N2) which makes it very slow for large data sets.
Bubble sort is a comparison-based sorting algorithm, which means that it requires a comparison operator to determine the relative order of elements in the input data set. It can limit the efficiency of the algorithm in certain cases.
*/