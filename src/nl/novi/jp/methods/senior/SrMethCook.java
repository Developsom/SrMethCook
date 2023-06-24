package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class SrMethCook {
    public static void main(String[] args) {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        List<String> capitalizedNames = capitalizeCustomerNames(customerNames);
        System.out.println(capitalizedNames);
    }

    public static List<String> capitalizeCustomerNames(List<String> names) {
        List<String> capitalizedNames = new ArrayList<>();

        for (String name : names) {
            String[] nameParts = name.split(" ");
            StringBuilder capitalized = new StringBuilder();

            for (int i = 0; i < nameParts.length; i++) {
                String namePart = nameParts[i];

                if (namePart.contains("-")) {
                    String[] hyphenParts = namePart.split("-");
                    for (int j = 0; j < hyphenParts.length; j++) {
                        String hyphenPart = hyphenParts[j];
                        if (j > 0) {
                            capitalized.append("-");
                        }
                        capitalized.append(capitalizeWord(hyphenPart));
                    }
                } else {
                    if (i > 0) {
                        capitalized.append(" ");
                    }
                    capitalized.append(capitalizeWord(namePart));
                }
            }

            capitalizedNames.add(capitalized.toString());
        }

        return capitalizedNames;
    }

    public static String capitalizeWord(String word) {
        if (word.isEmpty()) {
            return word;
        }

        String firstLetter = word.substring(0, 1).toUpperCase();
        String restOfWord = word.substring(1).toLowerCase();
        return firstLetter + restOfWord;
    }
}

// [Nick Piraat, Michael Jackson, Glennis Grace, Dreetje Hazes, Robbie Williams, Michiel De Ruyter, Sjaak Polak, Jan Van Jansen, Henk Den Hartog, MoEl-Mecky, Fredje Kadetje]
// Process finished with exit code 0
//