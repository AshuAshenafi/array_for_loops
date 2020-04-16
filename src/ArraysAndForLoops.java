
public class ArraysAndForLoops {
    public static void main(String[] args) {

        //declare and assign array
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};

        //declare and initialize sum
        int sum = 0;

        //iterate through the array and add each value
        for(int n : numbers){
            sum += n;
        }

        //print the result
        System.out.println("The sum of values in the array is: " + sum);

    }
}
