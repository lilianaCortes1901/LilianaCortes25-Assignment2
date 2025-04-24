import java.util.ArrayList;

public class ShellSort implements SortingInterface{
    @Override
    public int[] sorty(int[] input) {
        if(input == null || input.length == 0){
            return input;
        }

        int n = input.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = input[i];
                int j;
                for (j = i; j >= gap && input[j - gap] > temp; j -= gap) {
                    input[j] = input[j - gap];
                }
                input[j] = temp;
            }
        }
        return input;
    }
}
