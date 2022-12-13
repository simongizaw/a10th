import java.util.Scanner;
public class Lab_06_03_RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int longSide = 0 ;
        int shortSide = 0  ;
        int per = 0 ;


        System.out.print("Enter the long side of the rectangle ");
        if (in.hasNextDouble())
        {
            longSide= in.nextInt();
            in.nextLine();
        } else
        {
            System.out.println("That is not a correct input");
        }



        System.out.print("Enter the short side of your rectangle");
        if (in.hasNextDouble())
        {
            shortSide = in.nextInt();
            in.nextLine();
        } else
        {
            System.out.println("That is not a correct input");
        }


        per = (longSide + shortSide) * 2;


        System.out.println(" Your perimeter was " + per );

    }
}