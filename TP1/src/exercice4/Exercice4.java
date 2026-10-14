package Exercice4;

public class Exercice4 {
    public static void main(String[] args) {

        String chaine = "La programmation en Java";

        // 1. Longueur de la chaîne
        System.out.println("Longueur : " + chaine.length());

        // 2. Conversion en majuscules
        System.out.println("Majuscules : " + chaine.toUpperCase());

        // 3. Conversion en minuscules
        System.out.println("Minuscules : " + chaine.toLowerCase());

        // 4. Concaténation
        System.out.println("Concaténation : "
            + chaine.concat(" est amusante "));

        // 5. Remplacement de 'm' par 'l'
        System.out.println("Remplacement : "
            + chaine.replace('m', 'l'));

        // 6. Comparaison
        System.out.println("Comparaison : "
            + chaine.compareTo("Apprendre à programmer"));
    }
}
