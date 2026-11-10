package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class ConvertNamesToUpperCase_stream_2 {


    public static void main(String[] args){


        List<String> names= Arrays.asList("api","manual testing","pom","testing","selenium");

        names.stream().map(String ::toUpperCase).forEach(System.out::println);
    }
}
