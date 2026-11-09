package AlertsHandlings;

import java.util.Arrays;
import java.util.List;

public class ConvertNamesToUpperCase_stream {


    public static void main(String[] args){


        List<String> names= Arrays.asList("java","python","c++","C language","dot net");

        names.stream().map(String ::toUpperCase).forEach(System.out::println);
    }
}
