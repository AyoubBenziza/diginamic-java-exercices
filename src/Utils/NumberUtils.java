package Utils;

public class NumberUtils {
    // Convert a string to number and remove space
    public static int parseInt(String number) {
        return Integer.parseInt(number.replaceAll("\\s+", ""));
    }
}
