package app;

public class Main {
    public static void main(String[] args) {
        System.out.println(app.service.booleanLogic.bitwiseAnd("1010", "0111")); // muestra 0010
        System.out.println(app.service.booleanLogic.bitwiseOr("1010", "0111"));  // muestra 1111
        System.out.println(app.service.booleanLogic.bitwiseXor("1010", "0111")); // muestra 1101
        System.out.println(app.service.booleanLogic.bitwiseNot("1010"));         // muestra 0101
    }
}

