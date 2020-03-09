import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("KeyTable.txt")).useDelimiter( "(\\b|\\B)" );
        ArrayList<Key> keys = new ArrayList();
        while (scanner.hasNextLine()) {
            Key key = new Key();
            key.setOriginal(scanner.next());
            key.setSubstitution(scanner.nextLine());
            keys.add(key);

        }

        System.out.print("Enter the plain text: ");
        Scanner scanner1 = new Scanner((System.in));
        String input = scanner1.nextLine();
        Cipher cipher = new Cipher(input, keys);

        System.out.print("Enter the ciphered text: ");
        String input2 = scanner1.nextLine();
       // System.out.println("input2: "+input2);
        DeCipher deCipher = new DeCipher(input2, keys);

    }
}
