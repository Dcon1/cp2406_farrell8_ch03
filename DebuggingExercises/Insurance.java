import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by danny on 8/18/2017.
 */
public class Insurance {
    public static void main(String[] args) {
        int birthDate;
        int currentYear = 2017;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year of birth:");
        birthDate = input.nextInt();
        calcPremium(currentYear - birthDate);

    }
    private static void calcPremium(int age)
    {
        long premium;
        premium = (((age /10) + 15) * 20);
        System.out.println(premium);
    }
}
