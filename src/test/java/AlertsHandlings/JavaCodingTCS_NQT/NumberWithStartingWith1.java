package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class NumberWithStartingWith1 {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(10,20,30,12,14,15,18,10,45,13,19);

        numbers.stream().map(String::valueOf).filter(n->n.startsWith("1")).forEach(System.out::println);
    }
}
