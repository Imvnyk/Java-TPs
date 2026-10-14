package Exercice5;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Lecture des deux entiers
        System.out.print("Entrez le premier entier : ");
        int a = clavier.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int b = clavier.nextInt();

        // Calculs arithmétiques
        int somme = a + b;
        int difference = a - b;
        int produit = a * b;

        // Affichage des résultats
        System.out.println("Somme = " + somme);
        System.out.println("Différence = " + difference);
        System.out.println("Produit = " + produit);

        // Vérification avant division
        if (b != 0) {
            double quotient = (double) a / b;
            int reste = a % b;

            System.out.println("Quotient = " + quotient);
            System.out.println("Reste = " + reste);
        } else {
            System.out.println("Division impossible par zéro");
        }

        clavier.close();
    }
}