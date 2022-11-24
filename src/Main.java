import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Coding Exercise: Decimal Format");

        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println(String.format("%.3f", 3.1756));

        DecimalFormat dfSharp = new DecimalFormat("#.###");
        System.out.println("3.1756 = " + dfSharp.format(3.1756));

        DecimalFormat dfZero = new DecimalFormat("0.000");
        System.out.println("3.1756 = " + dfZero.format(3.1756));


    }

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        String firstValueString = df.format(firstValue);
        String secondValueString = df.format(secondValue);
        System.out.printf("firstValueString " + firstValueString + "  secondValueString " + secondValueString + "  ");


//        if (df.format(firstValue) == df.format(secondValue)) {
//            return true;
//        } else {
            return false;
        //}
    }
}