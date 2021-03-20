import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Decryption {

    public void decrypt() throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Note : Encryption Key act as Password to Decrypt the same Image, otherwise it will corrupt the Image.");

        System.out.print("Enter a key for Decryption : ");
        int key = sc.nextInt();

        // Selecting a Image for Decryption.

        FileInputStream fis = new FileInputStream("/Users/kunalsoni/Codes/javaCode/gandhiJee.jpg");

        // Converting image into byte array,it will
        // Create a array of same size as image.
        byte data[] = new byte[fis.available()];

        // Read the array

        fis.read(data);
        int i = 0;

        // Performing an XOR operation
        // on each value of
        // byte array to Decrypt it.
        for (byte b : data) {
            data[i] = (byte) (b ^ key);
            i++;
        }

        // Opening file for writting purpose
        FileOutputStream fos = new FileOutputStream("/Users/kunalsoni/Codes/javaCode/gandhiJee.jpg");

        // Writting Decrypted data on Image
        fos.write(data);
        fos.close();
        fis.close();
        System.out.println("Decyption Done...");
    }
}

class ImgEncryt_Decrypt extends Decryption {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Decryption di = new Decryption();
        di.decrypt();

        /*
         * Scanner sc = new Scanner(System.in); System.out.println(
         * "Note : Encryption Key act as Password to Decrypt the same Image,otherwise it will corrupt the Image."
         * );
         * 
         * // Here key is act as password to Encrypt and // Decrypt the Image
         * System.out.print("Enter key for Encryption : "); int key = sc.nextInt();
         * 
         * // Selecting a Image for operation FileInputStream fis = new
         * FileInputStream("/Users/kunalsoni/Codes/javaCode/gandhiJee.jpg");
         * 
         * // Converting Image into byte array, create a // array of same size as Image
         * size
         * 
         * byte data[] = new byte[fis.available()];
         * 
         * // Read the array fis.read(data); int i = 0;
         * 
         * // Performing an XOR operation on each value of // byte array due to which
         * every value of Image // will change. for (byte b : data) {
         * System.out.println(b + " "); data[i] = (byte) (b ^ key); i++; }
         * 
         * // Opening a file for writing purpose FileOutputStream fos = new
         * FileOutputStream("/Users/kunalsoni/Codes/javaCode/gandhiJee.jpg");
         * 
         * // Writing new byte array value to image which // will Encrypt it.
         * 
         * fos.write(data);
         * 
         * // Closing file fos.close(); fis.close();
         * System.out.println("Encyption Done...");
         */
    }
}
