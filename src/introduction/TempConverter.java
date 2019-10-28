package introduction;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        //ask the user to input the temperature in celsius
        System.out.println("Please enter the temperature to be converted: ");
        //get temperature to be converted off the user
        double temp = Double.parseDouble(new Scanner(System.in).nextLine());
        //convert input to fahrenheit
        Double tempfahrenheit = ((temp * 1.8) + 32);
        //display result to user
        System.out.println(tempfahrenheit);
    }
}
