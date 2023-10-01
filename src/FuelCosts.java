import java.util.Scanner;


public class FuelCosts
{
    public static void main(String[] args)
    {
        // scanner initial
        Scanner in = new Scanner(System.in);

        // variables initial
        double mpg = 0;
        double tank = 0;
        double pog = 0;
        double costPer100Miles = 0;
        double howFarOnGasTank = 0;
        String trash = "";
        boolean done = false;

        // usr input for mpg
        System.out.println("Enter miles per gallon: ");

        // do while to block input
        do
        {
            // Scanner for valid double
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine(); // buffer clear
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Your input: " + trash + " is invalid.");
                System.out.println("Enter miles per gallon again: ");
            }
        }while(!done);

        // done reset
        done = false;

        // usr input for tank
        System.out.println("Enter tank capacity in gallons: ");

        // do while to block input
        do
        {
            // Scanner for valid double
            if(in.hasNextDouble())
            {
                tank = in.nextDouble();
                in.nextLine(); // buffer clear
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Your input: " + trash + " is invalid.");
                System.out.println("Enter tank capacity in gallons again: ");

            }
        }while(!done);

        // done reset
        done = false;

        // usr input for pog
        System.out.println("Enter price of gas: ");

        // do while to block input
        do
        {
            // Scanner for valid double
            if(in.hasNextDouble())
            {
                pog = in.nextDouble();
                in.nextLine(); // buffer clear
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Your input: " + trash + " is invalid.");
                System.out.println("Enter price of gas again: ");
            }
        }while(!done);

        // calculations
        costPer100Miles = (100 / mpg) * pog;
        howFarOnGasTank = tank * mpg;

        System.out.println("Cost per 100 miles: " + costPer100Miles);
        System.out.println("The capacity of the tank: " + tank + " can go: " + howFarOnGasTank + " miles");


    }
}
