import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayList2D {
    public static void main(String[] args) {
        int n , d , q;
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

//        System.out.println("Enter number of lines: ");
        n = sc.nextInt();
//        sc.nextLine();
        for(int i = 0; i < n; i++) {
//            System.out.println("How many numbers will be on this line? ");
            d = sc.nextInt();
//            System.out.println("Enter the numbers : ");
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            array.add(row);
        }

//        System.out.println("Enter the number of queries: ");
        q = sc.nextInt();
        ArrayList<ArrayList<Integer>> qq = new ArrayList<>();
        for(int k = 0; k < q; k++){
            ArrayList<Integer> tempq = new ArrayList<>();
//            System.out.println("Enter the query : ");
            tempq.add(sc.nextInt());
            tempq.add(sc.nextInt());
            qq.add(tempq);
        }

        for(ArrayList obj : qq){

            ArrayList<Integer> tempq = obj;
            try {
//                System.out.println("query " + tempq.get(0) + " " + tempq.get(1));
//                System.out.println(array.get(tempq.get(0)-1));
                System.out.println(array.get(tempq.get(0)-1).get(tempq.get(1)-1));
            }
            catch (IndexOutOfBoundsException err) {
                System.out.println("ERROR!");
            }
        }
    }
}