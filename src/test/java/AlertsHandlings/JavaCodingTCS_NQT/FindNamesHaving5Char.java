package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class FindNamesHaving5Char {


    public static void main(String[] args){

        List<String> names= Arrays.asList("Ramu","sneha","Ravi","Bhanu","swapna","sandhya","rani");

        names.stream()

                .filter(name->name.length()>5)

                .forEach(System.out::println);
    }
}
