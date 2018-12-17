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

}
