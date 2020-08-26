package day03_sequences_Variables;
/* task:
   Variable: salary, tax
   tatalTax = salary*tax
   salaryAfterTAx = salary-totalTAx
   150000, 0.28
   150000 * 0.28
 */

public class salaryCalculator {
    public static void main(String[] args) {
        int salary = 150000;
        double tax = 0.28;
        double totalTax = salary * tax;
        System.out.println(totalTax);
        double salaryAfterTax = salary - totalTax;
        System.out.println(salaryAfterTax);

    }
}
