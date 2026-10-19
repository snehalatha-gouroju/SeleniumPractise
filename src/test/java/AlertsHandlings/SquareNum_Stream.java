package AlertsHandlings;

import java.util.Arrays;
import java.util.List;

public class SquareNum_Stream {
    public static void main(String[] args){


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);


        numbers.stream().map(n -> n*n ).forEach(System.out::println);
    }




}
