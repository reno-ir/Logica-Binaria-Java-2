// java
package app.service;

public class decimalToBinary {

    public static String toBinary(long n) {
        if (n == 0) return "0";
        return (n < 0 ? "-" : "") + Long.toBinaryString(Math.abs(n));
    }

    public static String toBinary(double value, int precision) {
        if (Double.isNaN(value)) return "NaN";
        if (Double.isInfinite(value)) return value > 0 ? "Infinity" : "-Infinity";

        boolean negative = value < 0;
        value = Math.abs(value);

        long integerPart = (long) value;
        double fraction = value - integerPart;
        if (fraction == 0.0 || precision <= 0) {
            return (negative ? "-" : "") + toBinary(integerPart);
        }

        StringBuilder frac = new StringBuilder();
        for (int i = 0; i < precision && fraction > 0.0; i++) {
            fraction *= 2;
            if (fraction >= 1.0) {
                frac.append('1');
                fraction -= 1.0;
            } else {
                frac.append('0');
            }
        }

        return (negative ? "-" : "") + toBinary(integerPart) + "." + frac.toString();
    }

    // Método que imprime la representación binaria: permite que main solo llame a esto.
    public static void printBinary(double value, int precision) {
        System.out.println(toBinary(value, precision));
    }
}