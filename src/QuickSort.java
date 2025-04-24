import java.util.ArrayList;

public class QuickSort implements SortingInterface{

    @Override
    public int[] sorty(int[] input) {
        if(input == null || input.length == 0){
            return input;
        }
        quickSort(input, 0, input.length-1);
        return input;
    }

    private void quickSort(int[] list, int low, int high){
        if (low < high) {
            int piovt = partition(list, low, high); // partition index
            quickSort(list, low, piovt - 1);  // Recursively sort left part
            quickSort(list, piovt + 1, high); // Recursively sort right part
        }
    }

    private int partition(int[] list, int low, int high) {
        int pivot = list[high];
        int i = low -1;

        for(int j = low; j < high; j++){
            if (list[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        int temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }
}
