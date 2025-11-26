package app.service;

public class booleanLogic {

    private static void validateBinary(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("La cadena no puede ser null o vacía");
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Cadena contiene caracteres no binarios: " + c);
            }
        }
    }

    private static String padLeft(String s, int len) {
        if (s.length() >= len) return s;
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len - s.length(); i++) sb.append('0');
        sb.append(s);
        return sb.toString();
    }

    public static String bitwiseAnd(String a, String b) {
        validateBinary(a);
        validateBinary(b);
        int max = Math.max(a.length(), b.length());
        String aa = padLeft(a, max);
        String bb = padLeft(b, max);
        StringBuilder res = new StringBuilder(max);
        for (int i = 0; i < max; i++) {
            char ra = aa.charAt(i);
            char rb = bb.charAt(i);
            res.append((ra == '1' && rb == '1') ? '1' : '0');
        }
        return res.toString();
    }

    public static String bitwiseOr(String a, String b) {
        validateBinary(a);
        validateBinary(b);
        int max = Math.max(a.length(), b.length());
        String aa = padLeft(a, max);
        String bb = padLeft(b, max);
        StringBuilder res = new StringBuilder(max);
        for (int i = 0; i < max; i++) {
            char ra = aa.charAt(i);
            char rb = bb.charAt(i);
            res.append((ra == '1' || rb == '1') ? '1' : '0');
        }
        return res.toString();
    }

    public static String bitwiseXor(String a, String b) {
        validateBinary(a);
        validateBinary(b);
        int max = Math.max(a.length(), b.length());
        String aa = padLeft(a, max);
        String bb = padLeft(b, max);
        StringBuilder res = new StringBuilder(max);
        for (int i = 0; i < max; i++) {
            char ra = aa.charAt(i);
            char rb = bb.charAt(i);
            res.append((ra != rb) ? '1' : '0');
        }
        return res.toString();
    }

    public static String bitwiseNot(String a) {
        validateBinary(a);
        StringBuilder res = new StringBuilder(a.length());
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            res.append(c == '1' ? '0' : '1');
        }
        return res.toString();
    }
}