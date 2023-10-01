import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args)
    {
        // Scanner
        Scanner in = new Scanner(System.in);

        // variables
        int tempC = 0;
        int tempF = 0;
        boolean done = false;
        String trash = "";


        // doWhile to block input

        do
        {
            // ask input
            System.out.println("Input temperature in C: ");

            // Scan for valid input
            if(in.hasNextInt())
            {
                tempC = in.nextInt();
                in.nextLine(); // buffer clear
                tempF = (tempC / 5) * 9 + 32;
                System.out.println("Temp in F: " + tempF);
                done = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said your temperature was: " + trash);
                System.out.println("Rerun and enter a valid temperature!");
            }

        }while(!done);

    }
}