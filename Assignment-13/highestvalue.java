import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class highestvalue {
public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Input.txt"));
            PrintWriter pw = new PrintWriter("Output.txt");
            sc.useDelimiter(",\\s*");
            while (sc.hasNextInt()) {
             int num = sc.nextInt();
             int highestDigit = findHighestDigit(num);
             pw.print(highestDigit + ", ");
            }
            sc.close();
            pw.close();
            System.out.println("Output written to Output.txt successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    public static int findHighestDigit(int num) {
    int maxDigit=0;
    while (num>0) {
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num = num/10;
        }
        return maxDigit;
    }
}
