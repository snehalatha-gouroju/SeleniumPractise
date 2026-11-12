package AlertsHandlings.JavaCodingTCS_NQT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateEleInList {

    public static void main(String[] args){

        List<Integer> numbers=Arrays.asList(10,20,30,40,50,50);

        Set<Integer> seen=new HashSet<>();

        numbers.stream().filter(n->!seen.add(n)).distinct().forEach(System.out::println);



    }
}
