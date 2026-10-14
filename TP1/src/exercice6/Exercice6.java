
package Exercice6;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {

        
        Scanner clavier = new Scanner(System.in);

        
        System.out.print("Entrez une durée en secondes : ");
        int duree = clavier.nextInt();

      
        int jours = duree / 86400;
        int heures = (duree % 86400) / 3600;
        int minutes = (duree % 3600) / 60;
        int secondes = duree % 60;

    
        System.out.println("Jours : " + jours);
        System.out.println("Heures : " + heures);
        System.out.println("Minutes : " + minutes);
        System.out.println("Secondes : " + secondes);

        clavier.close();
    }
}
