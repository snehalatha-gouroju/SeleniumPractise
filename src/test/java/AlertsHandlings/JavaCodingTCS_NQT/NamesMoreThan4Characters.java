package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class NamesMoreThan4Characters {


    public static void main(String[] args){

        List<String> names= Arrays.asList("Ram","Sneha","Ravi","Bhanu","swapna");
        names.stream().filter(name ->name.length()>4).forEach(System.out::println);



    }
}
