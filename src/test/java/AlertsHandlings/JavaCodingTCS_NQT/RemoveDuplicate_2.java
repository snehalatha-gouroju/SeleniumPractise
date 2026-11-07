package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate_2 {

    public static void main(String[] args){

        List<String> name = Arrays.asList("Ram" ,"Srivedi","raj","raj","sneha","sneha");

        name.stream().distinct().forEach(System.out::println);

    }
}
