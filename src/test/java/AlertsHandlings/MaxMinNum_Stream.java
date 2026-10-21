package AlertsHandlings;

import java.util.Arrays;
import java.util.List;

public class MaxMinNum_Stream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(25, 28, 49, 6, 9);

        int max = numbers.stream().max(Integer::compareTo).get();

        int min = numbers.stream().min(Integer::compareTo).get();


        System.out.println("Maximum = " + max);

        System.out.println("Minimum = " + min);
    }





}
