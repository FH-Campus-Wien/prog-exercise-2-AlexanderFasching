package at.ac.fhcampuswien;

import com.sun.rowset.internal.Row;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        double bN = 0;
        int i = 1;
        double t = 0;
        do {
            System.out.print("Number " + i + ": ");
            t = scanner.nextDouble();
            if(t > bN)
                bN = t;
            i++;
        } while(t > 0);
        if(bN == 0)
            System.out.println("No number entered.");
        else
            System.out.printf("The largest number is %.2f%n", bN);
    }

    //todo Task 2
    public void stairs(){
       Scanner scanner = new Scanner(System.in);

       int x = 0;
       System.out.print("n: ");
       int rows = scanner.nextInt();
       if(rows <= 0)
           System.out.println("Invalid number!");
       for(int i = 1; i <= rows; i++) {
           for(int j = 0; j < i; j++) {
               x++;
               System.out.print(x + " ");
           }
           System.out.println();
       }
    }

    //todo Task 3
    public void printPyramid(){
        final int ROWS = 6;
        for(int i = 1; i <= ROWS; i++) {
            for(int j = 1; j <= ROWS - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1 ; k++)
                System.out.print("*");
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);
        if(h % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }
        for(int i = -h / 2; i <= h / 2; i++) {
            for(int j = 0; j < Math.abs(i); j++) {
                System.out.print(" ");
            }
            for(int k = -h / 2; k <= h / 2; k++) {
                if(!(Math.abs(k) > h / 2 - Math.abs(i))) {
                    System.out.print((char)(c - Math.abs(k)));
                }
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int cFail = 0;
        int mark;
        int sum = 0;
        do {
            System.out.print("Mark " + i + ": ");
            mark = scanner.nextInt();
            if(mark < 0 || mark > 5)
                System.out.println("Invalid mark!");
            else if(mark > 0) {
                if(mark == 5)
                    cFail++;
                sum += mark;
                i++;
            }
        } while(mark != 0);
        if(i == 1)
            i++;
        System.out.printf("Average: %.2f%n", (double)sum/(i-1));
        System.out.println("Negative marks: " + cFail);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int neu = 0;
        do {
            do {
                neu += (n % 10) * (n % 10);
                n = n / 10;
            } while(n != 0);
            if(neu == 4) {
                System.out.println("Sad number!");
                return;
            }
            n = neu;
            neu = 0;
        } while(n != 1);
        System.out.println("Happy number!");
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}