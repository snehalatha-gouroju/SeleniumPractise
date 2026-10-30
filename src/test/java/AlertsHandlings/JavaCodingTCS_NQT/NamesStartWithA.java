package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class NamesStartWithA {


    public static void main(String[] args){

        List<String> names= Arrays.asList("Anjali" ,"sneha" ,"swapna","sandhya");

        names.stream().filter(names ->names.startsWith("A")).forEach(System.out::println);
    }
}
