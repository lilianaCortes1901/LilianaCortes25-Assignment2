import java.util.ArrayList;

public class InsertionSort implements SortingInterface{
    @Override
    public int[] sorty(int[] input) {
        for(int i = 0; i < input.length; i++){
            int temp = input[i];
            for(int j = i; j > 0 && temp < input[j-1]; j++){
                input[j] = input[j-1];
                input[j] = temp;
            }
        }

        return input;
    }
}
