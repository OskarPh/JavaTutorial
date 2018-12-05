public class Matrix {
    public static void main(String[] args) {
        int[][] m = new int[25][25];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = (int) (Math.random() * 1.5);
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static int[] sub(int[][] a) {
        int[] res = new int[3];

        for (int i = 1; i < a.length; i++) {
            for (int j = i + 1; j < a[i].length; j++)
                if (a[i][j] != 1)
                    return null;
                else
                    res[1] = a.length;
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++)
                if (a[i][j] != 0)
                    return null;
                else
                    res[2] = a.length;
        }


        return res;
    }
}
