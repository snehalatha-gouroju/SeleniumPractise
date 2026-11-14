package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class ConvertNamesToLowerCase_stream {


    public static void main(String[] args){


        List<String> names1= Arrays.asList("JAVA","SELENIUM","TESTING","POM","API");

        names1.stream().map(String ::toLowerCase).forEach(System.out::println);

        List<String> names2= Arrays.asList("CSS","C++","dotnet","PYTHON","HTML");

        names2.stream().map(String ::toLowerCase).forEach(System.out::println);
    }
}
