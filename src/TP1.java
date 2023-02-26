import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        test3();
        test2();
        somme();
        division();
        volume();
      /*  test();      */
    }

    public static void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour," + prenom);
    }
    public static void test2() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entre un entier: ");
            int unEntier = scanner.nextInt();
            System.out.println("Entre un reel: ");
            float unReel = scanner.nextFloat();
            System.out.println("J’ai recupere un entier: " + unEntier);
            System.out.println("J’ai aussi recupere un reel: " + unReel);
        }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale à " + somme);
    }

     public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier1 = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier2 = scanner.nextInt();
        int division = premierEntier1 / deuxiemeEntier2;
        System.out.println("La divion de " + premierEntier1 + " avec " + deuxiemeEntier2 + " est egale à " + division);

    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier11 = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier22 = scanner.nextInt();
        System.out.println("Veuillez saisir le troisième entier");
        int troisiemeEntier33 = scanner.nextInt();
        int volume = premierEntier11 * deuxiemeEntier22 * troisiemeEntier33;
        System.out.println("La volume du pavé droit est " + volume);
    }

  /*  public static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
// On saisit 11
        int entier = scanner.nextInt();
        System.out.println("Saisir une operation");
// Parce que le caractere newline n’a pas ete lu, c’est lui qui va se retrouver dans la variable operation
// Il va aussi etre impossible de saisir une autre valeur pour operation
        String operation = scanner.nextLine();


    }

   */
}

