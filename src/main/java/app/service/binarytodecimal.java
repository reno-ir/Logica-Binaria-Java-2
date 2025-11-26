package app.service;

public class binarytodecimal {

    public static int binaryToDecimal(String bin) {
        if (bin == null || bin.isEmpty()) {
            throw new IllegalArgumentException("La cadena no puede ser null o vacía");
        }
        int result = 0;
        for (int i = 0; i < bin.length(); i++) {
            char c = bin.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Cadena contiene caracteres no binarios: " + c);
            }
            result = result * 2 + (c - '0');
        }
        return result;
    }
}
