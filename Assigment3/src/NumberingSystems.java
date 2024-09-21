import java.util.Scanner;
public class NumberingSystems {
    public static void main(String[] args) {
        // making a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // asking the using for input
        System.out.println("Please enter binary numbers: ");
        String binaryInput = scanner.nextLine();

        // making sure the user has the right amount of numbers for program to run
        if (binaryInput.length() > 16 || !binaryInput.matches("[01]+")) {
            System.out.println("Invalid binary number");
        } else {
            // making binary number to a decimal
            int decimalValue = Integer.parseInt(binaryInput, 2);

            // making binary number to octal and hexadecimal
            String octalValue = Integer.toOctalString(decimalValue);
            String hexValue = Integer.toHexString(decimalValue).toUpperCase();

            // showing the user the results
            System.out.println("Binary: " + binaryInput);
            System.out.println("Decimal: " + decimalValue);
            System.out.println("Octal: " + octalValue);
            System.out.println("Hexadecimal: " + hexValue);
        }

        scanner.close();
    }
}
