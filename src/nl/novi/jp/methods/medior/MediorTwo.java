package nl.novi.jp.methods.medior;

/**
 * Gegeven:Methode die boolean teruggeeft op basis van de gegeven leeftijd.
 *
 * Roep isOldEnough vanuit de main-methode aan.
 * Op basis van de return value:
 * Roep je of printUnderAgeWarning() of printProceed() uit.
 */
public class MediorTwo {
    public static void main(String[] args) {

    }

    public  static boolean isOldEnough(int age) {
        if(age > 17) {
            return true;
        } else {
            return false;
        }
    }

    public static void printUnderAgeWarning() {
        System.out.println("You are not old enough for this activity!");
    }

    public static void printProceed() {
        System.out.println("No warning!");
    }
}