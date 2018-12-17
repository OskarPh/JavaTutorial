package Cw22;

import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {
        // THIS
        try{
            podniesArrayIndexOutOfBoundsException();
            podniesFileNotFoundException();
            podniesException();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        }catch(FileNotFoundException e) {
            System.out.println(e);

        }catch(Exception e) {
            System.out.println(e);

        }

        // OR THIS?
        try{
            podniesArrayIndexOutOfBoundsException();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        }try{
            podniesFileNotFoundException();
        }catch(FileNotFoundException e) {
            System.out.println(e);

        }try{
            podniesException();
        }catch(Exception e) {
            System.out.println(e);

        }

        //Zadanie 2
        try {
            System.out.println(podajLiczbe("0b101010101"));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        try {
            System.out.println(podajLiczbe("0b10101"));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        try {
            System.out.println(podajLiczbe("0o63734645"));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        try {
            System.out.println(podajLiczbe("0x348FB74A"));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        // Zadanie 3
        Rakieta Miki = new Rakieta("Miki", 800);
        try{
            Miki.start();
        } catch (Exception e) {
            System.out.println(e);
        }
        Miki.zatankuj();
        try{
            Miki.start();
        } catch (Exception e) {
            System.out.println(e);
        }
        Miki.zatankuj();
        try{
            Miki.start();
        } catch (Exception e) {
            System.out.println(e);
        }
        Miki.zatankuj();
    }

    public static void podniesArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Index out of bound!");
    }

    public static void podniesFileNotFoundException() throws FileNotFoundException {
        throw new FileNotFoundException("File not found!");
    }

    public static void podniesException() throws Exception {
        throw new Exception("zla jednostka");
    }

    public static int podajLiczbe(String nr) throws NumberFormatException {
        String sysPart = nr.substring(0, 2);
        String sigPart = nr.substring(2, nr.length());
        System.out.println("Significant part " + sigPart);
        int res = 0;
        if(sysPart.equals("0b")) {
            if (isBinary(sigPart))
                res = binToDec(sigPart);
        } else if(sysPart.equals("0o")) {
            if (isOct(sigPart))
                res = octToDec(Integer.parseInt(sigPart));
        } else if (sysPart.equals("0x")){
            if (isHex(sigPart))
                res = hexToDec(sigPart);
        }
        else {
            throw new NumberFormatException("Zly format liczby");
        }
        return res;
    }

    public static boolean isBinary(String number) {
        char o = '0';
        return number.matches("[01]+"); // regular expression or use
        // for loop doesn't want to work, something wrong with comparing char to '0'
//        for(int i = 0; i < number.length(); i++) {
//            System.out.println(number.charAt(i));
//            if(number.charAt(i) != o || number.charAt(i) != '1') {
//                System.out.println("WTF");
//                return false;
//            }
//        }
//        return true;
    }

    public static int binToDec(String str){
        double j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '1'){
                j=j+ Math.pow(2,str.length()-1-i);
            }

        }
        return (int) j;
    }

    public static boolean isHex(String number) {
        boolean ret;
        try {
            int t = Integer.parseInt(number, 16);
            ret = true;
        } catch (NumberFormatException e) {
            ret = false;
        }
        return (ret);
    }

    public static int hexToDec(String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    public static boolean isOct(String octal) {
        boolean isOctal = false;
        if (octal != null && !octal.isEmpty()) {
            int number = Integer.parseInt(octal);
            while (number > 0) {
                if (number % 10 <= 7) {
                    isOctal = true;
                } else {
                    isOctal = false;
                    break;
                }
                number /= 10;
            }
        }
        return isOctal;
    }

    public static int octToDec(int octal){
        //Declaring variable to store decimal number
        int decimal = 0;
        //Declaring variable to use in power
        int n = 0;
        //writing logic
        while(true){
            if(octal == 0){
                break;
            } else {
                int temp = octal%10;
                decimal += temp*Math.pow(8, n);
                octal = octal/10;
                n++;
            }
        }
        return decimal;
    }

}
