package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNames {

    public static void main(String[] args){


        List<String> names= Arrays.asList("Ram","Sneha","Ram","Ravi","Sneha");

        names.stream().distinct().forEach(System.out::println);

    }
}
