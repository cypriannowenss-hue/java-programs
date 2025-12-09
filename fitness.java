Cyprian Kameli
J77-10537-2024
 A PROGRAM TO COMPUTE fitness level
 */
234
public class FitnessApp {

    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your steps for today: ");
        int steps = scanner.nextInt();
        String level = getFitnessLevel(steps);
        System.out.println("Your fitness level: " + level);
        scanner.close();
    }
}