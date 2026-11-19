package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class LengthGreaterThan5 {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Java", "Selenium", "python", "testng");

        names.stream().filter(n -> n.length() > 5).forEach(System.out::println);
    }
}
