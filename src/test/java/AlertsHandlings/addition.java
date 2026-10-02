package AlertsHandlings;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class addition {

    public static void main(String[] args){

        System.out.println("Enter First Number ?");

        Scanner sc=new Scanner(System.in);

        int FirstNum=sc.nextInt();

        System.out.println("Enter Second Number ?");

        int SecondNum=sc.nextInt();

        int sum;

        sum = FirstNum + SecondNum;

        System.out.println("the sum of first and second number is :" +sum);
    }
}
