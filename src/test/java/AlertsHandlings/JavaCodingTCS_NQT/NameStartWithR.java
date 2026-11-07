package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class NameStartWithR {

    public static void main(String[] args){

        List<String> names= Arrays.asList("Anjali" ,"sneha" ,"swapna","sandhya","Rani","Ranisandhya","Rohith");

        names.stream().filter(name ->name.startsWith("Ra")).forEach(System.out::println);
    }
}
