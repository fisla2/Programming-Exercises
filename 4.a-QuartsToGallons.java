public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;  // Constant for quarts in a gallon
        int quartsNeeded = 18;  // Variable for quarts needed
        
        int gallons = quartsNeeded / QUARTS_IN_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON;
        
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}
