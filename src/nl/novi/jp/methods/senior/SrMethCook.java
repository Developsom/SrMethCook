package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                            capitalized.append(" ");
                        }
                        if (!isPrefix(hyphenPart)) {
                            capitalized.append(capitalizeWord(hyphenPart));
                        } else {
                            capitalized.append(hyphenPart.toLowerCase());
                        }
                    }
                } else {
                    if (i > 0) {
                        capitalized.append(" ");
                    }
                    if (!isPrefix(namePart)) {
                        capitalized.append(capitalizeWord(namePart));
                    } else {
                        capitalized.append(namePart.toLowerCase());
                    }
                }
            }

            capitalizedNames.add(capitalized.toString());
        }

        return capitalizedNames;
    }

    public static boolean isPrefix(String word) {
        List<String> prefixes = Arrays.asList("van", "de", "den");
        return prefixes.contains(word.toLowerCase());
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




/**
 * Assignment
                Namen
 * 1: Tussenvoegsels geen hoofdletter.
 * 2: Eerste letter na '-': Hoofdletter

                First attempt
[Nick Piraat, Michael Jackson, Glennis Grace, Dreetje Hazes, Robbie Williams, Michiel De Ruyter, Sjaak Polak, Jan Van Jansen, Henk Den Hartog, MoEl-Mecky, Fredje Kadetje]
Process finished with exit code 0

                Error:
 Tussenvoegsel bevat hoofdletter

                Opvallend:
 Console log:
 'MoEl-Mecky'
        '-' Verricht iets met de spatie
        Na de '-' is er een hoofdletter

 customerNames.add("mo el-mecky");
 Correcte vorm zou moeten zijn: Mo el-Mecky.
    Of zou het: Mo El-Mecky moeten zijn omdat 'El'-Mecky geen tussenvoegsel is?


Assignment specificeert:
 * 2: Eerste letter na '-': Hoofdletter

 Correcte vorm zou moeten zijn:
 Mo el-Mecky

 Maar '-' is wel verbindend in Nederlandse taal?
 Dan zou correct definiëren:
Mo El-Mecky

 Ik ga akkoord met wat het eerste werkt nadat ik de space fix heb
 */
