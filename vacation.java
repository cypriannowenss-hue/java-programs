Cyprian Kameli
j77-10537-2024
 A PROGRAM TO COMPUTE vacation cost cost
 */

public class vacationcost { 
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        double accommodation = 1200.50;
        double meals = 150.25;
        double activities = 100.00;

        double total = calculateTotalCost(accommodation, meals, activities);
        System.out.printf("Total Vacation Cost: $%.2f%n", total);
    }
}