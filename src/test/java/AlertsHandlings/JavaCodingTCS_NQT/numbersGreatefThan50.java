package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class numbersGreatefThan50 {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(10,20,30,40,45,67,43,78,9,897,67);

        numbers.stream().filter(n->n>50).forEach(System.out::println);

    }
}
