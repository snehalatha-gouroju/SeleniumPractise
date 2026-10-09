package AlertsHandlings;

public class SumofArray2 {



    public static void main(String[] args) {

        int[] num = {10, 60, 80, 20, 30};

        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            sum = sum + num[i];
        }
        System.out.println("Sum = " + sum);
    }
}

