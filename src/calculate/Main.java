package calculate;

import java.util.Scanner;

public class Main extends Calculator{


    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
Main obj = new Main();
char choice ='Y';

System.out.println("Welcome to java Program to perform the Operations between a and b");
while (choice =='Y'){
    System.out.println("Please enter the first number:    ");
    int a = scan.nextInt();
    System.out.println("Please enter the second number:   ");
    int b = scan.nextInt();
    System.out.println("Please enter any one operational symbol from +,-,/,*");
    char symbol = scan.next().charAt(0);
    obj.calculateResult(a, b, symbol);
    System.out.println("would you like to perform more operations ? Please enter 'Y' or 'N' ");
    choice = scan.next().charAt(0);
}
scan.close();
    }
}
