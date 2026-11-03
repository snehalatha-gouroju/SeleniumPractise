package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class SortNamsAlpha {

    public static void main(String[] args){

        List<String> names=Arrays.asList("Sneha", "Anu","Ravi","Bhanu");

        names.stream().sorted().forEach(System.out::println);
    }


}
