import java.util.Scanner;

public class converter {

    // Decimal to Binary
    public static String decimalToBinary(int num) {
        return Integer.toBinaryString(num);
    }

    // Decimal to Hexadecimal
    public static String decimalToHex(int num) {
        return Integer.toHexString(num);
    }

    // Binary to Decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number System Converter");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Hexadecimal");
        System.out.println("3. Binary to Decimal");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Decimal number: ");
                int dec = sc.nextInt();
                System.out.println("Binary: " + decimalToBinary(dec));
                break;

            case 2:
                System.out.print("Enter Decimal number: ");
                int dec2 = sc.nextInt();
                System.out.println("Hexadecimal: " + decimalToHex(dec2));
                break;

            case 3:
                System.out.print("Enter Binary number: ");
                String bin = sc.next();
                System.out.println("Decimal: " + binaryToDecimal(bin));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
