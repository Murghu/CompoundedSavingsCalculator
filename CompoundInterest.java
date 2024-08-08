import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {
    private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                                            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                                            "Eighteen", "Nineteen" };
    private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the daily contribution amount in Rs: ");
        double dailyContribution = scanner.nextDouble();

        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        double compoundedAmount = calculateCompoundedAmount(dailyContribution, days);
        String amountInWords = convertToWords((int) compoundedAmount);

        System.out.printf("After %d days, the compounded amount is: %.2f Rs\n", days, compoundedAmount);
        System.out.println("In words: " + amountInWords + " Rupees");
    }

    public static double calculateCompoundedAmount(double dailyContribution, int days) {
        double totalAmount = 0.0;
        for (int i = 0; i < days; i++) {
            totalAmount += dailyContribution * Math.pow(2, i);
        }
        return totalAmount;
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
        }

        if (number < 1000) {
            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " + convertToWords(number % 100) : "");
        }

        if (number < 100000) {
            return convertToWords(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " " + convertToWords(number % 1000) : "");
        }

        if (number < 10000000) {
            return convertToWords(number / 100000) + " Lakh" + ((number % 100000 != 0) ? " " + convertToWords(number % 100000) : "");
        }

        return convertToWords(number / 10000000) + " Crore" + ((number % 10000000 != 0) ? " " + convertToWords(number % 10000000) : "");
    }
}