//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);

    System.out.println("Indtast venligst din højde og vægt. ");

    double højde = input.nextDouble();
    int vægt = input.nextInt();
    double BMI = vægt/(højde*højde);

    System.out.println("Ud fra den indtastet data er BMI udregnet til " + BMI);

    }
}