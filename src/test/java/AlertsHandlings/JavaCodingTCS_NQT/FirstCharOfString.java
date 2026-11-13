package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class FirstCharOfString {

    public static void main(String[] args){


        List<String> names= Arrays.asList("Java","Python","Selenium");

        names.stream().map(name->name.substring(0,1)).forEach(System.out::println);
    }
}
