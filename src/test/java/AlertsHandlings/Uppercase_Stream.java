package AlertsHandlings;

import java.util.Arrays;
import java.util.List;

public class Uppercase_Stream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sneha", "ram", "sita");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
