public class Main {
    public static void main(String[] args) {

        int[] input = {35, -12, 24, 19, 97, 43, 0, 9, -3};
        //Create objects
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        ShellSort shellSort = new ShellSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();

        System.out.println("Sorted Array: ");
        for(int i = 0; i < input.length; i++){
            System.out.println(input[i] + " ");
        }

        //create separate print statements for each algorithm or add it as conditionals


    }
}