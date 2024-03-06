/*Nama: Muhammad Reynaldi Akbar */
/*NIM:  24060122130052 */
/*File: ExceptionOnArray.java */
/*Deskripsi: File Java ExceptionOnArray */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[3] = 10;
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        finally{
            System.out.println("Clean up code ...");
        }
    }
}
