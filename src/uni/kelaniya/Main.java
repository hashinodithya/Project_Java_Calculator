package uni.kelaniya;

import java.util.Scanner;

public class Main {

    public static void sum(int num1,int num2) {
        System.out.println(num1+num2);
    }// Adding two numbers

    public static void differ(int num1,int num2) {
        System.out.println(num1-num2);
    }// Subtracting two numbers

    public static void multi(int num1,int num2) {
        System.out.println(num1*num2);
    }// Multiply two numbers

    public static void divide(double num1,double num2) {
        System.out.println(num1/num2);
    }// Divide two numbers

    public static void main(String[] args) {

        System.out.println("Hello !....");
        System.out.println("What you want to do? ");
        System.out.println();
        System.out.println("Press num 1 for sum ");
        System.out.println("Press num 2 for substract ");
        System.out.println("Press num 3 for multiply ");
        System.out.println("Press num 4 for divide ");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Press your option: ");
        int opt = input.nextInt();
        System.out.println();

        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.println();

        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();
        System.out.println();
        System.out.print("Answer is : ");
        switch (opt){
            case 1:
                sum(num1,num2);
                break;
            case 2:
                differ(num1,num2);
                break;
            case 3:
                multi(num1,num2);
                break;
            case 4:
                divide(num1,num2);
                break;
            default:
                System.out.println("Invalid option ");
        }



    }
}
