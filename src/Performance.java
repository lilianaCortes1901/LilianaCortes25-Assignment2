import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Performance {
    public static void main(String[] args){
        int[] performSizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int performIterations = 20;

        //Call the algorithms
        SortingInterface[] performSorting = {
                new QuickSort(), new MergeSort(), new InsertionSort(), new ShellSort(),
                new SelectionSort(), new BubbleSort()
        };

        String[] sortingNames = {
                "Quick Sort", "Merge Sort", "Insertion Sort", "Shell Sort",
                "Selection Sort", "Bubble Sort"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sortingAlgorithm_report.txt"))){
            writer.write("Sorting Algorithm Performance Report\n");
            writer.write("Tested over " + performIterations + "iterations.\n\n");

            for(int i = 0; i < performSorting.length; i++){
                Tester tester = new Tester(performSorting[i]);

                String algorithmName = sortingNames[i];
                writer.write("Sorting algorithm - " + algorithmName + "\n");
                System.out.println("Sorting algorithm - " + algorithmName);

                for (int performSize : performSizes) {
                    double total = 0;
                    for (int k = 0; k < performIterations; k++) {
                        total += tester.singleTest(performSize);
                    }
                    double average = total / performIterations;
                    String results = "Sorted " + performSize + " elements in " + String.format("%.3f", average) + "ms (avg)";

                    writer.write(results + "\n");
                    System.out.println(results);
                }
                writer.write("\n");
                System.out.println("\n");
            }
            System.out.println("Report Created");
        } catch (IOException e){
            System.err.println("Error creating report: " + e.getMessage());
        }

    }
}
