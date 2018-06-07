import java.util.*;
import java.io.*;


public class Hello {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input your number ");
//        int i = 1;
//        System.out.println("Divided by 3: ");
//        for(; i<100; i++) {
//            if(i%3==0) {
//                System.out.print(i + ", ");
//
//            }
//        }
//        System.out.println("\nDivided by 5: ");
//        for(i=1; i<100; i++) {
//            if (i % 5 == 0) {
//                System.out.print(i + ", ");
//
//            }
//        }
//        System.out.println("\nDivided by 3 & 5: ");
//        for(i=1; i<100; i++) {
//            if (i % 15 == 0) {
//                System.out.print(i + ", ");
//
//            }
//        }
//    }
//
//        System.out.println("Input a number(string): ");
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        int r = Integer.parseInt(s);
//        System.out.printf("The integer value is: %d", r);
//        System.out.println("Input a number :");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        while (n>1) {
//            if(n%2==0)
//                n /= 2;
//            else
//                n = n*3+1;
//
//            System.out.println(n);
//        }
//        Scanner in = new Scanner(System.in);
//        double n = in.nextDouble();
//        System.out.println("Original Number: "+n);
//        int sum = 0;
//        while (n>0) {
//            sum += n%10;
//            n=n/10;
//        }
//        print_number(sum);
//
//    }
//
//    public static void print_number(int n) {
//        int x; int y; int z;
//        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//        System.out.println("Sum of the digits of the said number: "+n);
//        if (n < 10) {
//            System.out.println(number[n]);
//        }
//        else if (n < 100) {
//            x = n / 10;
//            y = n - x *10;
//            System.out.println("In English: "+number[x] + " " + number[y]);
//        }
//        else {
//            x = n / 100;
//            y = (n - x * 100) / 10;
//            z = n - x * 100 - y * 10;
//            System.out.println("In English: "+number[x] + " " + number[y] + " " + number[z]);
//        }
//        System.out.println("System security interface:");
//        System.out.println(System.getSecurityManager());
//        // gets the value of the specified environment variable "PATH"
//        System.out.println("\nEnvironment variable PATH: ");
//        System.out.println(System.getenv("PATH"));
//
//        // gets the value of the specified environment variable "TEMP"
//        System.out.println("\nEnvironment variable TEMP: ");
//        System.out.println(System.getenv("TEMP"));
//
//        // gets the value of the specified environment variable "USERNAME"
//        System.out.println("\nEnvironment variable USERNAME: ");
//        System.out.println(System.getenv("USERNAME"));

    /* Here we are intentionally assigning a null
     * value to a reference so that the object becomes
     * non reachable
     */
    String[] students = new String[10];
    String studentName = "Peter Smith";
    students[0] = studentName;
    studentName = null;

    /* Here we are intentionally assigning reference a
     * to the another reference b to make the object referenced
     * by b unusable.
     */
    Hello[] a = new Hello[10];
    a[0] = new Hello();
    Hello b = new Hello();
    for(int i = 0; i < a.length; i++) {
        a[i] = null;
    }
//    a[0] = null;
//    a[0] = b;
//    b = null;
    System.gc();
}
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collection is performed by JVM");
    }

}
