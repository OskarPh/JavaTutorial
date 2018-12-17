package Cw18;

public class Solution {
//    public static void kwadrat(int n, char znak) {
//        char x = 'x', o = 'o', znak2;
//        if (znak == x) znak2 = o;
//        else znak2 = x;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i % 2 == 0) {
//                    if (j % 2 == 0) {
//                        System.out.print(znak);
//                    } else {
//                        System.out.print(znak2);
//                    }
//                } else {
//                    if (j % 2 == 1) {
//                        System.out.print(znak);
//                    } else {
//                        System.out.print(znak2);
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    // Zadanie 2
//    public static boolean corazWieksze(char[][] tab) {
//        int row = tab.length-1;
//        int col = tab[0].length-1;
//        if(row < 2 || col < 2) {
//            System.out.println("Tablica jest za mała");
//            return false;
//        }
////        boolean l_res = false;
//        // pierwszy wiersz
//        for(int i = 0; i < col - 2; i++) {
//            if(tab[0][i] < tab[0][i+1] && tab[0][i+1] < tab[0][i+2]) {
//                return true;
//            }
//        }
//        // ostatni wiersz
//        for(int i = 0; i < col - 2; i++) {
//            if(tab[row][i] < tab[row][i+1] && tab[row][i+1] < tab[row][i+2]) {
//                return true;
//            }
//        }
//        // pierwsza kolumna
//        for(int i = 0; i < row - 2; i++) {
//            if(tab[i][0] < tab[i+1][0] && tab[i+1][0] < tab[i+2][0]) {
//                return true;
//            }
//        }
//        // ostatnia kolumna
//        for(int i = 0; i < row - 2; i++) {
//            if(tab[i][col] < tab[i+1][col] && tab[i+1][col] < tab[i+2][col]) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean jestRowna(char[][] tab1, char[][] tab2) {
//        boolean l_res = false;
//        if(tab1.length != tab2.length || tab1[0].length != tab2[0].length)
//            return false;
//        System.out.println("Petla");
//        for(int i = 0; i < tab1.length; i++) {
//            for (int j = 0; j < tab1[i].length; j++) {
//                if(tab1[i][j] != tab2[i][j])
//                    return false;
//            }
//        }
//        return true;
//    }
//
//    public static void srednia(double[][] a) {
//        double sr;
//        for(int i = 0; i < a.length; i++) {
//            sr = (a[i][0] + a[i][1])/2;
//            if(a[i][0]<sr && sr<a[i][1])
//                System.out.println(a[i][0] +", " + a[i][1]);
//        }
//    }
//
//

    public static void main(String[] args) {
//        kwadrat(3, 'x');
//        kwadrat(4, 'x');
//        kwadrat(3, 'o');
//        kwadrat(4, 'o');
//
//        char[][] tab2 = new char[10][10];
//        for(int i = 0; i < tab2.length; i++) {
//            for (int j = 0; j < tab2[i].length; j++) {
//                tab2[i][j] = (char) (Math.random() * ('z' - 'a') + 'a');
//                System.out.print(tab2[i][j] + ", ");
//            }
//            System.out.println();
//        }
//
//        if(corazWieksze(tab2)) System.out.println("Tak");
//        else System.out.println("Nie");
//
//        char[][] tab22 = new char[10][10];
//        for(int i = 0; i < tab22.length; i++) {
//            for (int j = 0; j < tab22[i].length; j++) {
//                tab22[i][j] = (char) (Math.random() * ('z' - 'a') + 'a');
//                System.out.print(tab22[i][j] + ", ");
//            }
//            System.out.println();
//        }
//
//        if(corazWieksze(tab22)) System.out.println("Tak");
//        else System.out.println("Nie");
//
//        char[][] tab33 = {{'a','a','a'},{'a','a','a'},{'a','a','a'}};
//        if(jestRowna(tab33, tab33))
//            System.out.println("Rowne");
//        else System.out.println("Nie rowne");
//
//
//        double[][] tab4 = new double[10][2];
//        for(int i = 0; i < tab4.length; i++) {
//            for (int j = 0; j < tab4[i].length; j++) {
//                tab4[i][j] = Math.random() * 100;
////                System.out.print(tab4[i][j] + ", ");
//            }
////            System.out.println();
//        }
//        srednia(tab4);
//    String s = "Liczby";
//    int i = 1, j = 2;
//    String w;
//    w = s + i + j;
//        System.out.println(w);
//    w = i + j + s;
//        System.out.println(w);
//    w = i + 2 + s;
//        System.out.println(w);
//        int i ;
//        System.out.println(i);
//        float f = 3.1f;
//        char c = 'c';
//        boolean b = true;
//        int[] tab;
//        String s;
//        System.out.println(s);
//
//        char [ ] [ ] tab3 = {
//                {'S' , 'a' , 'm' , 's' , 'u' , 'n' , 'g' } ,
//                {'N' , 'o' , 'k' , 'i' , 'a' } ,
//                {'A' , 'p' , 'p' , 'l' , 'e' } ,
//                {'B' , 'l' , 'a' , 'c' , 'k' , 'B' , 'e' , 'r' , 'r' , 'y' } ,
//                {'A' , 'l' , 'c' , 'a' , 't' , 'e' , 'l' } ,
//                {'S' , 'o' , 'n' , 'y' } ,
//                {'J' , 'o' , 'l' , 'l' , 'a'}
//        };
//        System.out.println('z' - 'Z');
//        System.out.println('a' - 'A');
//        System.out.println('b' - 'B');
//        for(int i=0; i<tab3.length; i++){
//            for(int j=0; j<tab3[i].length; j++){
//                // to for ponizej mozna by zmienic na while
//                for(int k=j+1; k<tab3[i].length-1; k++){
//                    if(tab3[i][j]==tab3[i][k] || tab3[i][j]-tab3[i][k]=='z'-'Z'){
//                        dwa = true;
//                    }
//                }
//            }
//            if(dwa){
//                for(int j=0; j<tab3[i].length; j++){
//                    System.out.print(tab[i][j]);
//                }
//                System.out.println("zawiera przynajmniej dwie takie same litery");
//            }
//            l=false;
//        }
    // Zadanie 1
//        Owoc fruit = new Owoc("Banan");
//        fruit.wypisz();
//
//    // Zadanie 2
//        Dzem dzem1 = new Dzem("trustawkowy", 50);
//        Dzem dzem2 = new Dzem("ananasowy");
//        Dzem dzem3 = new Dzem( 20);
//
//    // Zadanie 3
//        Sloik sloik1 = new Sloik(dzem1);
//        Sloik sloik1a = new Sloik(new Dzem("jagodowy", 12));
//        Sloik sloik2 = new Sloik(dzem2);
//        Sloik sloik2a = new Sloik(new Dzem("malinowy"));
//        Sloik sloik3 = new Sloik(dzem3);
//        Sloik sloik3a = new Sloik(new Dzem(12));
//    }
//
//
//}
//
//// Zadanie 1
//class Owoc {
//    String nazwa;
//    double waga = Math.random() * 0.3 + 0.5;
//
//    Owoc(String nazwa) {
//        this.nazwa = nazwa;
//    }
//
//    void wypisz() {
//        System.out.println(this.nazwa + " waży " + this.waga);
//    }
//}
//
//// Zadanie 2
//class Dzem {
//    private String smak = "No name";
//    private double waga = 100;
//
//    Dzem(String smak, double waga) {
//        this.smak = smak;
//        this.waga = waga;
//    }
//
//    Dzem(String smak) {
//        this(smak, 100);
//    }
//
//    Dzem(double waga) {
//        this("No name", waga);
//    }
//}
//
//// Zadanie 3
//class Sloik {
//    Dzem dzem;
//    boolean czyOtwarty;
//    Sloik(Dzem dzem) {
//        otworz();
//        this.dzem = dzem;
//        zamknij();
//    }
//    void otworz() {
//        // mozna by jeszcze sprawdzic czy jest obecnie zamkniety: if(!czyOtwarty) czyOtwarty = true;
//        czyOtwarty = true;
//    }
//    void zamknij() {
//        // mozna by jeszcze sprawdzic czy jest obecnie otwarty: if(czyOtwarty) czyOtwarty = false;
//        czyOtwarty = false;
//    }
//}
//
//// Zadanie 4
//class Fabryka{
//    double stanKg = 0;
//    void przyjmij(Owoc owoc) {
//        this.stanKg += owoc.waga;
//    }
//
//    Sloik[] robDzemy() {
//        Sloik[] dzemy = new Sloik[10];
//        if (stanKg >= 10) {
//            for (int i = 0; i < dzemy.length; i++) {
//                dzemy[i] = new Sloik(new Dzem(1));
//            }
//        }
//        return dzemy;
//    Cw20.Prostokat p = new Cw20.Prostokat(10,11);
//    System.out.println(p.getBokA());
//
//    Cw20.Prostopadloscian pa = new Cw20.Prostopadloscian(10, 12, 11);
//    System.out.println(pa.Pole());
//
//    Cw20.Prostopadloscian pa2 = new Cw20.Prostopadloscian(p, 11);
//    System.out.println(pa2.Pole());
//    System.out.println(pa2.Objetosc());
        // Zadanie 1
        Owoc fruit = new Owoc("Banan");
        fruit.wypisz();

        // Zadanie 2
        Dzem dzem1 = new Dzem("trustawkowy", 50);
        Dzem dzem2 = new Dzem("ananasowy");
        Dzem dzem3 = new Dzem( 20);

        // Zadanie 3
        Sloik sloik1 = new Sloik(dzem1);
        Sloik sloik1a = new Sloik(new Dzem("jagodowy", 12));
        Sloik sloik2 = new Sloik(dzem2);
        Sloik sloik2a = new Sloik(new Dzem("malinowy"));
        Sloik sloik3 = new Sloik(dzem3);
        Sloik sloik3a = new Sloik(new Dzem(12));
    }
    }

