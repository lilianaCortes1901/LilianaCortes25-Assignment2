import javax.imageio.IIOException;
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
            writer.write("Sorting Algorithm Performance Report");
            writer.write("Tested over " + performIterations + "iterations.");

            for(int i = 0; i < performSorting.length; i++){
                Tester tester = new Tester(performSorting[i]);
                writer.write("Current Algorithm " + sortingNames[i] + ": ");
                    for(int j = 0; j < performSizes.length; j++){
                        double total = 0;
                        for(int k = 0; k < performIterations; k++){
                            total += tester.singleTest(performSizes);
                        }
                        double average = total/performIterations;
                        String results = "Array size " + performSizes + ": " + String.format("%.3f", average) + "ms";
                        writer.write(results + " ");
                        System.out.println(results);
                    }
                writer.write("");
            }
            System.out.println("Report Created");
        } catch (IOException e){
            System.err.println("Error creating report: " + e.getMessage());
        }

    }
}
