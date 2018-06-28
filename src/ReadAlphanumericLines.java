import java.io.*;
import java.util.*;

public class ReadAlphanumericLines {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = s.nextInt();
        for(int i = 0; i < N; i++)
            list.add(s.nextInt());
//        int[] arr = list.toArray(new int[0]);
        int Q = s.nextInt();
        System.out.println(Q);
        s.nextLine();
        for(int j = 0; j < Q; j++) {
            System.out.println("j = " + j);
            String in = s.next();
            System.out.println("in = " + in);
            if(in.equals("Insert")) {
                int ind = s.nextInt();
                int ele = s.nextInt();
                list.add(ind, ele);
                System.out.printf("ind ele %d %d\n", ind, ele);
            }
            else if(in.equals("Delete")) {
                int rev = s.nextInt();
                list.remove(rev);
                System.out.println("rev = " + rev);
            }
        }
        s.close();
        for(Integer el : list) System.out.print(el + " ");
    }
}