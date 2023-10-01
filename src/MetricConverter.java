import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args)
    {
        // Scanner
        Scanner in = new Scanner(System.in);

        // variables
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean done = false;
        String trash = "";


        // doWhile to block input

        do
        {
            // ask input
            System.out.println("Input meter(s): ");

            // Scan for valid input
            if(in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine(); // buffer clear
                done = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said your meters were: " + trash);
                System.out.println("Rerun and enter a valid measurement!");
            }

        }while(!done);

        // calculations
        miles = meters / 1609;
        feet = meters * 3.281;
        inches = meters * 39.37;

        System.out.println("Meters: " + meters + " converts into miles: " + miles + ", feet: " + feet + ", and inches: " + inches);
    }
}