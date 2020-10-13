import java.util.Scanner;
public class LeapYearCalculator{
    public static void main(String [] args){
        Scanner yr = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = yr.nextInt();

        if(year % 4 == 0){
            if (year % 100 == 0) {
                if(year % 400 == 0){
                    System.out.println(year + " is a Leap Year.");
                }
                else{
                    System.out.println(year + " is not a Leap Year.");
                }
            }
            else {
                System.out.println(year + " is a Leap Year.");
            }

        }
        else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}

