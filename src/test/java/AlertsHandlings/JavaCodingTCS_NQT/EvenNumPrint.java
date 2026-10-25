package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class EvenNumPrint {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(10,20,45,67,89,21);

        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
