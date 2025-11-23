import java.util.Scanner;
public class FactorionNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the lower bound of the range: ");
int lower = sc.nextInt();
System.out.print("Enter the upper bound of the range: ");
int upper = sc.nextInt();
boolean found = false;
System.out.println("Factorion numbers in the range:");
for (int i = lower; i <= upper; i++) {
    if (FactorionUtils.isFactorion(i)) {
    System.out.println(i);
    found = true;
    }
    }
if (!found) {
    System.out.println("No factorion numbers found in the given range.");
    }
  sc.close();
    }
}
