import java.util.Random;
import java.util.Scanner;

public class converterAndDice 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number to convert to decimal : ");
        String binStr = sc.nextLine();

        try
        {
            int decimalNum = Integer.parseInt(binStr,2);
            System.out.println("The decimal equivalent of binary " + binStr + " is " + decimalNum + ".");
        }
        catch(final NumberFormatException e)
        {
            System.out.println("Invalid binary number..!");
        }

        System.out.println("\nRolling a pair of dice..");
        Random random = new Random();
        int d1 = random.nextInt(6)+1;
        int d2 = random.nextInt(6)+1;
        System.out.println("You rolled a "+d1+" and a "+d2+" . Total : "+(d1+d2));

        sc.close();
    

    }
    
}
