import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();

        boolean check = false;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    check = true;
                }
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
