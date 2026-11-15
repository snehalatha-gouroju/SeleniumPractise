package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class LengthOfString {


    public static void main(String[] args){

        List<String> names= Arrays.asList("java","selenium","testNG","python");

        names.stream().map(name->name.length()).forEach(System.out::println);
    }
}
