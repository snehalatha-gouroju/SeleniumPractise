package AlertsHandlings;

import java.util.Arrays;

public class AscendingOrder {


    public static void main(String[] args) {

        int[] arr = {45, 18, 49, 5, 23, 1};

        System.out.println("Before Sorting:");

        System.out.print((Arrays.toString(arr)));

        Arrays.sort(arr);

        System.out.println("After Sorting in Ascending Order:");

        System.out.println(Arrays.toString(arr));

    }
}

