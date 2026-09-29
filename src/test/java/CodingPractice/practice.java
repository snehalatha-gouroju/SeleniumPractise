package CodingPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class practice {

    public static void main(String[] args){

        int number;

        System.out.println("Enter Number :");

        Scanner sc=new Scanner(System.in);

        number=sc.nextInt();

        if(number % 2 ==0)
            System.out.println("Entered number is Even Number");
        else
            System.out.println("Entered number is Odd Number");



          }
}
