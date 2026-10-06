package AlertsHandlings;

import java.util.Scanner;

public class div {


    public static void main(String[] args){

        System.out.println("Enter First Number ?");

        Scanner sc=new Scanner(System.in);

        int FirstNum=sc.nextInt();

        System.out.println("Enter Second Number ?");

        int SecondNum=sc.nextInt();

        int res;

        res = FirstNum  / SecondNum;

        System.out.println("the sum of first and second number is :" +res);
    }
}


