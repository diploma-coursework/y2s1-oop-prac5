import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a product code: ");
        String productCode = scanner.nextLine();

        if (validateProductCode(productCode)) System.out.println("Valid Product Code");
        else System.out.println("Invalid Product Code");
    }

    static boolean validateProductCode(String productCode) {
        if (productCode.length() != 8) return false;

        for (int i = 0; i < 2; i++) {
            if (!Character.isUpperCase(productCode.charAt(i))) return false;
        }

        for (int i = 2; i < 8; i++) {
            if (!Character.isDigit(productCode.charAt(i))) return false;
        }

        return true;
    }
}
