import java.util.ArrayList;

public class SelectionSort implements SortingInterface{
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;
        int temp = 0;

        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(input[j] < input[minIndex]){
                    minIndex = j;
                }
                input[j] = input[minIndex];
                input[minIndex] = temp;
            }
        }
        return input;
    }
}
