import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        //To input the number of rows in the half diamond pattern
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int rows = input.nextInt();
        input.close();

        //Start of the half diamond pattern
        System.out.println("*");

        //Loop for the upper half of the pyramid
        for (int a = 1; a <= rows; a++) {
            //Insert this so it can have an * before the number
            System.out.print("*");
            for (int j = 1; j <= a; j++) {
                System.out.print(j);
            }
            for (int j = a - 1; j >= 1; j--) {
                System.out.print(j);
            }
            //Insert this so it can have an * after the number
            System.out.println("*");
        }

        //Loop for the lower half of the pyramid
        for (int a = rows - 1; a >= 1; a--) {
            //Insert this so it can have an * before the number
            System.out.print("*");
            for (int j = 1; j <= a; j++) {
                System.out.print(j);
            }
            for (int j = a - 1; j >= 1; j--) {
                System.out.print(j);
            }
            //Insert this so it can have an * after the number
            System.out.println("*");
        }
        
        //End of the half diamond pattern
        System.out.println("*");
    }
}