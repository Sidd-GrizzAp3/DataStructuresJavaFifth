import java.util.Arrays;
public class Test_main {

    public static void main (String [] args) {
        // intialize an unordred array 
        int [] testArray  = {5, 5, 5, 4, 6, 7, 3, 2, 8, 10}; 
        InsertionSort sorter = new InsertionSort(); 
        int [] outputArray = sorter.sort(testArray);
        System.out.println(Arrays.toString(outputArray)); 
        System.out.println(sorter.count); 
    }
}