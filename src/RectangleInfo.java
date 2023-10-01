import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        // Scanner
        Scanner in = new Scanner(System.in);

        // variables
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        double diagonal = 0;

        boolean done = false;
        String trash = "";


        // doWhile to block input

        do
        {
            // ask input
            System.out.println("Input length: ");

            // Scan for valid input
            if(in.hasNextInt())
            {
                length = in.nextInt();
                in.nextLine(); // buffer clear
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said your length was: " + trash);
                System.out.println("Rerun and enter a valid length!");
            }

        }while(!done);

        done = false;

        do
        {
            // ask input
            System.out.println("Input width: ");

            // Scan for valid input
            if(in.hasNextInt())
            {
                width = in.nextInt();
                in.nextLine(); // buffer clear
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You said your width was: " + trash);
                System.out.println("Rerun and enter a valid length!");
            }

        }while(!done);

        // calculations
        perimeter = (length * 2) + (width * 2);
        area = length * width;
        diagonal = Math.sqrt((length * length) + (width * width));

        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);
        System.out.println("The diagonal is: " + diagonal);

    }
}