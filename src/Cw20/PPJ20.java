package Cw20;

public class PPJ20 {
    public static void main(String[] args){


        Prostokat p = new Prostokat(10,11);
        System.out.println("Pole protokąta: " + p.Pole());

        Prostopadloscian pa = new Prostopadloscian(10, 12, 11);
        System.out.println("Pole Prostopadłościanu: " +pa.Pole());

        Prostopadloscian pa2 = new Prostopadloscian(p, 11);
        System.out.println("Pole Prostowadłościanu 2: " +pa2.Pole());
        System.out.println("Objętość Prostowadłościanu 2: " +pa2.Objetosc());

        //=============================================================================
        Trojkat t = new Trojkat(10);
        System.out.println("Pole Trójkąta równobocznego: " +t.Pole());

        Ostroslup os = new Ostroslup(4,2);
        System.out.println("Pole Ostrosłupa: " +os.Pole());

        Ostroslup os2 = new Ostroslup(t, 11);
        System.out.println("Pole ostrosłupa 2: " +os2.Pole());
        System.out.println("Objętość ostrosłupa 2: " +os2.Objetosc());

        //========================================================================================
        Graniastoslup g = new Graniastoslup(5,3);
        System.out.println("Pole graniastosłupa: " + t.Pole());

        Graniastoslup g2 = new Graniastoslup(t, 11);
        System.out.println("Pole graniastosłupa 2: " + g2.Pole());
        System.out.println("Objętość granisastosłupa 2: " + g2.Objetosc());

    }
}
