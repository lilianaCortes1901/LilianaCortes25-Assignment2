import java.util.Arrays;

public class Main {

    private static void printSortedArray(int[] sortedArray){
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] input = {2, 5, 8, 4, 1, 3,7,6};
        //Create objects
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        ShellSort shellSort = new ShellSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();

        System.out.println("Initial Array: " + Arrays.toString(input));

        int[] bubbleSorted = bubbleSort.sorty(input);
        System.out.println("Bubble Sort Result: ");
        printSortedArray(bubbleSorted);

        int[] insertSorted = insertionSort.sorty(input);
        System.out.println("Insert Sort Result: ");
        printSortedArray(insertSorted);

        int[] selectionSorted = selectionSort.sorty(input);
        System.out.println("Selection Sort Result: ");
        printSortedArray(selectionSorted);

        int[] shellSorted = shellSort.sorty(input);
        System.out.println("Shell Sort Result: ");
        printSortedArray(shellSorted);

        int[] quickSorted = quickSort.sorty(input);
        System.out.println("Quick Sort Result: ");
        printSortedArray(quickSorted);

        int[] mergeSorted = mergeSort.sorty(input);
        System.out.println("Merge Sort Result: ");
        printSortedArray(mergeSorted);

    }
}