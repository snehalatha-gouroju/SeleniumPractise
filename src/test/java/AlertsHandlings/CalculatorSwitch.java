package AlertsHandlings;

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args){

            System.out.println("1-add \n 2-Subtract \n 3-Multiply \n 4-Division");

            System.out.println("Choose Ooerator ?");

            Scanner sc=new Scanner(System.in);

            int operator= sc.nextInt();

            System.out.println("Enter First Number :");

            int n1=sc.nextInt();

            System.out.println("Enter Second Number :");

            int n2=sc.nextInt();

            int result=0;
            switch(operator){
                case 1:
                    result = n1 + n2;
                    break;
                case 2:
                    result = n1 - n2;
                    break;
                case 3:
                    result = n1 * n2;
                    break;
                case 4:
                    result = n1 / n2;
                    break;
                default:
                    System.out.println("Entered Operator is not valid Try again");
            }

            System.out.println("Result is :" +result);


        }
    }


