package AlertsHandlings;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static void main(String[] args){

        Integer[] numbers={19,57,80,69,3,5,7,2,4};

        Arrays.sort(numbers , Collections.reverseOrder());

        System.out.println("Descending order :");

        for(int num : numbers){
            System.out.print(num + " ");
        }

    }
}
