import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final int ADULT_MEAL_PRICE = 7;
        final int CHILD_MEAL_PRICE = 4;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of adult meals: ");
        int adultMeals = scanner.nextInt();  // Input for adult meals
        
        System.out.print("Enter the number of child meals: ");
        int childMeals = scanner.nextInt();  // Input for child meals
        
        double adultTotal = adultMeals * ADULT_MEAL_PRICE;
        double childTotal = childMeals * CHILD_MEAL_PRICE;
        double totalAmount = adultTotal + childTotal;
        
        System.out.println("Total money collected for adult meals: $" + adultTotal);
        System.out.println("Total money collected for child meals: $" + childTotal);
        System.out.println("Total money collected for all meals: $" + totalAmount);
    }
}
