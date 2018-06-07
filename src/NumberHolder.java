public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder n = new NumberHolder();
        n.anInt = 10;
        n.aFloat = 10.50f;

        System.out.println(n.anInt);
        System.out.println(n.aFloat);
    }
}