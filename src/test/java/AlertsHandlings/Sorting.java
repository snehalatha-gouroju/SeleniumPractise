package AlertsHandlings;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args){

        int[] numbers={5,6,7,4,9};

        Arrays.sort(numbers);

        System.out.println("Sorted Array:");

        for(int number : numbers){

            System.out.println(number + " ");
        }
    }
}
