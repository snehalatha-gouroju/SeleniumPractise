package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class SquareOfEachNumber {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(2,3,4,5);

        numbers.stream().map(n -> n * n).forEach(System.out::println);
    }
}
