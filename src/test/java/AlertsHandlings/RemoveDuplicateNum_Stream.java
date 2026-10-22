package AlertsHandlings;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNum_Stream {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(10,20,30,40,20,10,50,60);

        numbers.stream().distinct().forEach(System.out::println);

   
    }


}
