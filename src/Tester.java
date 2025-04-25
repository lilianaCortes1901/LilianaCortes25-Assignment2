import java.util.Random;

public class Tester {
    private SortingInterface sortingInterface;

    public Tester(SortingInterface sa){
        this.sortingInterface = sa;
    }

    double singleTest(int size){
        int[] arrayInput = new int[size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            arrayInput[i] = random.nextInt(10000);
        }
        //Records Start time for run
        long startTime = System.nanoTime();

        //run using arrayInput
        sortingInterface.sorty(arrayInput);

        //Records End time for run
        long endTime = System.nanoTime();

        double totalTime = (endTime - startTime)/ 1e6; //1e6 converts to milliseconds

        return totalTime;
    }

    public void test(int iterations, int size){
        double totalTime = 0;
        for(int i = 0; i < iterations; i++){
            totalTime += singleTest(size);
        }

        double averageTime = totalTime/iterations;

        System.out.println("Average time to run sorting algorithms: ");
    }
}
