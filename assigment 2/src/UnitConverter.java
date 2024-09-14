import java.util.Scanner;

public class UnitConverter {

    private static final double INCHES_PER_FOOT = 12.0;
    private static final double INCHES_PER_CUBIT = 18.0;
    private static final double INCHES_PER_STEP = 30.0;
    private static final double INCHES_PER_YARD = 36.0;
    private static final double INCHES_PER_MILE = 63360.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the value to convert:");
        double value = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the unit to convert from (inches, feet, cubits, steps, yards, miles):");
        String fromUnit = scanner.nextLine().trim().toLowerCase();
        System.out.println("Enter the unit to convert to (inches, feet, cubits, steps, yards, miles):");
        String toUnit = scanner.nextLine().trim().toLowerCase();

        double valueInInches = value;
        if (fromUnit.equals("feet")) {
            valueInInches = value * INCHES_PER_FOOT;
        } else if (fromUnit.equals("cubits")) {
            valueInInches = value * INCHES_PER_CUBIT;
        } else if (fromUnit.equals("steps")) {
            valueInInches = value * INCHES_PER_STEP;
        } else if (fromUnit.equals("yards")) {
            valueInInches = value * INCHES_PER_YARD;
        } else if (fromUnit.equals("miles")) {
            valueInInches = value * INCHES_PER_MILE;
        }
        double convertedValue = valueInInches;
        if (toUnit.equals("feet")) {
            convertedValue = valueInInches / INCHES_PER_FOOT;
        } else if (toUnit.equals("cubits")) {
            convertedValue = valueInInches / INCHES_PER_CUBIT;
        } else if (toUnit.equals("steps")) {
            convertedValue = valueInInches / INCHES_PER_STEP;
        } else if (toUnit.equals("yards")) {
            convertedValue = valueInInches / INCHES_PER_YARD;
        } else if (toUnit.equals("miles")) {
            convertedValue = valueInInches / INCHES_PER_MILE;
        }
        System.out.printf("%.2f %s is equal to %.2f %s.%n", value, fromUnit, convertedValue, toUnit);

        scanner.close();
    }
}
