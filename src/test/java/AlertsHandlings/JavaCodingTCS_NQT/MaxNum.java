package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class MaxNum {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(10,50,20,50,70,48);

        int max =numbers.stream().max(Integer::compareTo).get();

        System.out.println(max);
    }





}
