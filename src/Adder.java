public class Adder {
    public static void main(String[] args) {
        int sum = 0;
        int al = args.length;
        if(al == 1) {
            System.out.println("This program requires at least two command-line arguments.");
        } else {
            for (int i = 0; i < al; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println(sum);
        }
    }
}
