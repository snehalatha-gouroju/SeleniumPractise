package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.List;

public class FindNum_Btw10To20 {



    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(5,15,25,35,5,60);

        numbers.stream()
                .filter(n->n>=10 && n<=50)
                .forEach(System.out::println);





    }
}
