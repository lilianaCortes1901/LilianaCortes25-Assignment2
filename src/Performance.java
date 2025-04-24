
public class Performance {
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort selectionSort = new SelectionSort();
        ShellSort shellSort = new ShellSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();

        //Tester.java
        SortingInterface bubbleSortTest = new BubbleSort();
        Tester testerBubbleSort = new Tester(bubbleSort);
        testerBubbleSort.test(20,100);
        testerBubbleSort.test(20,500);
        testerBubbleSort.test(20,1000);
        testerBubbleSort.test(20,2000);
        testerBubbleSort.test(20,5000);
        testerBubbleSort.test(20,10000);
        testerBubbleSort.test(20,20000);
        testerBubbleSort.test(20,75000);
        testerBubbleSort.test(20,150000);

        SortingInterface insertSortTest = new InsertionSort();
        Tester testerInsertSort = new Tester(insertionSort);
        testerInsertSort.test(20,100);
        testerInsertSort.test(20,500);
        testerInsertSort.test(20,1000);
        testerInsertSort.test(20,2000);
        testerInsertSort.test(20,5000);
        testerInsertSort.test(20,10000);
        testerInsertSort.test(20,20000);
        testerInsertSort.test(20,75000);
        testerInsertSort.test(20,150000);

        SortingInterface selectedSortTest = new SelectionSort();
        Tester testerSelectSort = new Tester(selectionSort);
        testerSelectSort.test(20,100);
        testerSelectSort.test(20,500);
        testerSelectSort.test(20,1000);
        testerSelectSort.test(20,2000);
        testerSelectSort.test(20,5000);
        testerSelectSort.test(20,10000);
        testerSelectSort.test(20,20000);
        testerSelectSort.test(20,75000);
        testerSelectSort.test(20,150000);

        SortingInterface shellSortTest = new ShellSort();
        Tester testerShellSort = new Tester(shellSort);
        testerShellSort.test(20,100);
        testerShellSort.test(20,500);
        testerShellSort.test(20,1000);
        testerShellSort.test(20,2000);
        testerShellSort.test(20,5000);
        testerShellSort.test(20,10000);
        testerShellSort.test(20,20000);
        testerShellSort.test(20,75000);
        testerShellSort.test(20,150000);

        SortingInterface quickSortTest = new QuickSort();
        Tester testerQuickSort = new Tester(quickSort);
        testerQuickSort.test(20,100);
        testerQuickSort.test(20,500);
        testerQuickSort.test(20,1000);
        testerQuickSort.test(20,2000);
        testerQuickSort.test(20,5000);
        testerQuickSort.test(20,10000);
        testerQuickSort.test(20,20000);
        testerQuickSort.test(20,75000);
        testerQuickSort.test(20,150000);

        SortingInterface mergeSortTest = new MergeSort();
        Tester testerMergeSort = new Tester(mergeSort);
        testerMergeSort.test(20,100);
        testerMergeSort.test(20,500);
        testerMergeSort.test(20,1000);
        testerMergeSort.test(20,2000);
        testerMergeSort.test(20,5000);
        testerMergeSort.test(20,10000);
        testerMergeSort.test(20,20000);
        testerMergeSort.test(20,75000);
        testerMergeSort.test(20,150000);
    }
}
