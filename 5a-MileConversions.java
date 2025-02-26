public class MileConversions {
    public static void main(String[] args) {
        final int INCHES_IN_MILE = 63360;  // 1 mile = 63,360 inches
        final int FEET_IN_MILE = 5280;    // 1 mile = 5,280 feet
        final int YARDS_IN_MILE = 1760;   // 1 mile = 1,760 yards
        
        int miles = 3;  // You can change this to any number
        
        int inches = miles * INCHES_IN_MILE;
        int feet = miles * FEET_IN_MILE;
        int yards = miles * YARDS_IN_MILE;
        
        System.out.println(miles + " miles is equivalent to:");
        System.out.println(inches + " inches");
        System.out.println(feet + " feet");
        System.out.println(yards + " yards");
    }
}
