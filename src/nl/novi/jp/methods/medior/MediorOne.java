package nl.novi.jp.methods.medior;

/**
 * Methode getal kwadrateert returnt integer
 * Roep aan vanuit main-methode.
 */

public class MediorOne {

    public static void main(String[] args) {
        int result = calculateSum(10, 22);

        System.out.println("De som van 10 en 12 is: " + result);

        int doubledResult = doubleNumber(result);

        System.out.println(result + " verdubbeld is: " + doubledResult);

        int SquaredResult = squaredNumber(doubledResult);

        System.out.println(result + " gekwadrateert is: " + SquaredResult);

    }

    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int doubleNumber(int number) {
        return number * 2;
    }

    public static int squaredNumber(int number) {
        return number * 2;
    }



}