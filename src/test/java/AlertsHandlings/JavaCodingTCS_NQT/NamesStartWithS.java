package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class NamesStartWithS {

    public static void main(String[] args){



            List<String> names= Arrays.asList("Anjali" ,"Sneha" ,"Swapna","Sandhya","Rani" ,"Shekar");

            names.stream().filter(name ->name.startsWith("S")).forEach(System.out::println);
        }

}
