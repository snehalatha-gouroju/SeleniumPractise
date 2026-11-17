package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class StringContaining_A {

    public static void main(String[] args){

        List<String> names= Arrays.asList("Java","Python","Selenium","Cucumer");

        names.stream().filter(n->n.contains("a")).forEach(System.out::println);
    }
}
