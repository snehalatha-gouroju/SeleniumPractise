package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class PracticeBTW_20_60 {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(10,20,30,40,50,60,70);

        numbers.stream().filter(n-> n>=20 && n <=60).forEach(System.out::println);

    }
}
