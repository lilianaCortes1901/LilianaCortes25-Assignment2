
public class MergeSort implements SortingInterface{
    public int[] sorty(int[] input) {
        int[] mergeSortInput = input.clone();
        mergeSort(mergeSortInput, 0, mergeSortInput.length -1);
        return input;
    }

    public void mergeTogether(int[] mergeSortInput, int left, int midVal, int right){
        int temp1 = midVal - left +1;
        int temp2 = right - midVal;
        int[] LeftVal = new int[temp1];
        int[] RightVal = new int[temp2];
        System.arraycopy(mergeSortInput, left, LeftVal, 0, temp1);
        System.arraycopy(mergeSortInput, midVal +1, RightVal, 0, temp2);
        int i = 0;
        int j = 0;
        int k = left;
        while (i < temp1 && j < temp2) {
            if (LeftVal[i] <= RightVal[j]) {
                mergeSortInput[k++] = LeftVal[i++];
            } else {
                mergeSortInput[k++] = RightVal[j++];
            }
        }
        while (i < temp1) {
            mergeSortInput[k++] = LeftVal[i++];
        }
        while (j < temp2) {
            mergeSortInput[k++] = RightVal[j++];
        }
    }

    public void mergeSort(int[] mergeSortInput, int left, int right ){
        if(left < right){
            int midVal = left + (right - left)/2;
            mergeSort(mergeSortInput, left, midVal);
            mergeSort(mergeSortInput, midVal +1, right);
            mergeTogether(mergeSortInput, left, midVal, right);
        }
    }
}
