import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's average grade: ");
        double avg = sc.nextDouble();

        System.out.print("Enter number of absences: ");
        int abs = sc.nextInt();

        boolean result = (avg >= 75 && abs <= 3) || avg >= 90;

        System.out.println();

        if (result == true) {
            System.out.println("Result: PASS");
            if (avg >= 90) {
                System.out.println("Reason: Average is 90 or above so it qualifies even with many absences.");
            } else {
                System.out.println("Reason: Average is at least 75 and absences are within the limit of 3.");
            }
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Average is under 75, or absences crossed 3 with average below 90.");
        }

        sc.close();
    }
}
