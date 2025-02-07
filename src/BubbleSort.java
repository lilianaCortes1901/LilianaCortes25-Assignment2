import java.util.ArrayList;
//would not implement using ArrayList - initially thought I could, but it would
//be assuming all sorting algorithms are implemented using ArrayList which is not the case.

public class BubbleSort implements SortingInterface{

    @Override
    public int[] sorty(int[]  input) {
        int n = input.length;
        int temp;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(input[j] > input[j+1]){
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }

        return input;
    }
}
