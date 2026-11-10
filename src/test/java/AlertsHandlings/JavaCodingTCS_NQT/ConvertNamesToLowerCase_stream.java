package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class ConvertNamesToLowerCase_stream {


    public static void main(String[] args){


        List<String> names= Arrays.asList("JAVA","SELENIUM","TESTING","POM","API");

        names.stream().map(String ::toLowerCase).forEach(System.out::println);
    }
}
