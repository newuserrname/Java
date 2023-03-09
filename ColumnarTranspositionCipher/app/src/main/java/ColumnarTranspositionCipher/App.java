package ColumnarTranspositionCipher;

import java.util.Scanner;

public class App {
    
    public static final String alpha = "hello";
    public static String encrypted(String message, int shiftKey) {
        message = message.toLowerCase();
        String cipherText = "";
        for (int ii = 0; ii < message.length(); ii++) {
            int charPosition = alpha.indexOf(message.charAt(ii));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int key = 0;
        System.out.print("Enter the String for Encryption:");
        message = sc.next();

        System.out.println("\n\nEnter Shift Key:");
        key = sc.nextInt();
        System.out.println("\nEncrpyted msg:" + encrypted(message, key));
    } //main method ends
} //Solution Class End
