import java.util.Scanner;

public class first {
    public static void main(String args[])
    {
        Scanner sun = new Scanner(System.in);
        double no1,no2,ans;

        System.out.print("Enter first number: ");
        no1 = sun.nextDouble();

        System.out.print("Enter second number: ");
        no2 = sun.nextDouble();

        ans=no1 + no2;

        System.out.print("Answer is "+ ans);
    }
}