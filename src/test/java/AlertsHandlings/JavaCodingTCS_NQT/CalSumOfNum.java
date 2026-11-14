package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class CalSumOfNum {

    List<Integer> numbers= Arrays.asList(10,20,30,40,50);

    int sum=numbers.stream().mapToInt(Integer::intValue).sum();


}
