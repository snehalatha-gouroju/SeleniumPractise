package AlertsHandlings;

import java.util.Scanner;

public class avg {


    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Numbers ?");
        int count=sc.nextInt();

        System.out.println("Enter First Number ?");

        int FirstNum=sc.nextInt();


        System.out.println("Enter Second Number ?");

        int SecondNum=sc.nextInt();

        int sum;

        sum = FirstNum + SecondNum;

        System.out.println("the sum of first and second number is :" +sum);


        int avg=sum/count;

        System.out.println("the avg of sum is :" +avg);
    }
}
