/**
 * Created by jc441213 on 16/08/17.
 */
import java.util.Scanner;
public class BookstoreCredit {
    public static void main() {
        String name;
        Double gpa;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name");
        name = input.nextLine();
        System.out.print("Enter gpa");
        gpa = input.nextDouble();
        calcCredit(name, gpa);
    }

    private static void calcCredit(String name, Double gpa) {
        System.out.println("Hi " + name + ". Your grade point average is" + gpa + ". This gives you a discount of " + (gpa * 10));
    }
}