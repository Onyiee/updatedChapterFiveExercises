package exerciseFivePointOneEight;
//5.18 (Modified Compound-Interest Program) Modify the application in Fig. 5.6 to use only integers
//        to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
//        of pennies. Then break the result into its dollars and cents portions by using the division
//        and remainder operations, respectively. Insert a period between the dollars and the cents portions.]

public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        int amount;
        int principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year) {
            amount = (int) (principal * Math.pow(1 + rate, year));

            int dollars = amount / 100;
            int cents = amount % 100;
            System.out.println();
           System.out.printf("%4d %10d.%d%n", year, dollars,cents);

        }
    }
}
