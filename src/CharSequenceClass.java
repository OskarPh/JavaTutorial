public class CharSequenceClass implements CharSequence {
    private String s;

    public CharSequenceClass(String s) {
        this.s = s;
    }

    public char charAt(int index) {
        return s.charAt(index);
    }

    public int length() {
        return 1;
    }

    public CharSequence subSequence(int start, int end) {
        return new CharSequenceClass("test");
    }

    public String toString() {
        String ns;
        for(int i = s.length() - 1; i >= 0; i--) {
            ns += s.charAt(i);
        }
        return ns;
    }

    public static void main(String[] args) {
        CharSequenceClass c = new CharSequenceClass("TEST");
        System.out.println(c.toString());
        CharSequenceClass b = new CharSequenceClass("Your implementation should return the string backwards. Select one of the sentences from this book to use as the data.");
        System.out.println(b.toString());

    }

}
