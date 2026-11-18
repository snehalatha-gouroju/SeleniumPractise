package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class NumGreaterThan10 {


    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(5,49,30,59,3,15);

        numbers.stream().filter(n->n>10).forEach(System.out::println);

    }
}
