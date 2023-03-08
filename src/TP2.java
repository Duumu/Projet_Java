
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;
public class TP2 {
    public static void main(String[] args) {
       /* discriminant();
        max();
        min();
        parite();
        egaliteStr();
        factorielle();
        countdown();
        carres();
        tableMultiplication();
        division();
        regle();
        nombrePremier(); */
        initialisationTableau();

    }

    /*
        public static void discriminant() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quelle est la valeur de a ?");
            float a = scanner.nextInt();
            System.out.println("Quelle est la valeur de b ?");
            float b = scanner.nextInt();
            System.out.println("Quelle est la valeur de c ?");
            float c = scanner.nextInt();
            float delta = (float) (Math.sqrt(Math.pow(b, 2) - 4 * a * c));
            System.out.println(delta);
            if (delta < 0) {
                System.out.println("le polynome n'a pas de racines relles");
                double Rdelta = Math.sqrt(-delta);
                System.out.println("Les racines sont x1 = (" + -b + "+i *" + Rdelta + ")/" + 2 * a + " et x2 (" + -b + "-i *" + Rdelta + ")/" + 2 * a);
            } else if (delta == 0) {
                float x0 = -(float) b / (2 * a);
                System.out.println("la racine de ce polynom est x0 = " + x0);
            } else {
                double Rdelta = Math.sqrt(delta);
                float x1 = (float) ((-b + Rdelta) / (2 * a));
                float x2 = (float) ((-b - Rdelta) / (2 * a));
                System.out.println("les racines sont x1 =" + x1 + " et x2 =" + x2);
            }
        }

        public static void parite() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisie un entier");
            int a = scanner.nextInt();
            if (a %2 == 0 ) {
                System.out.println(a);
                System.out.println("Ce chiffre est pair");
            }
            else {
                System.out.println(a);
                System.out.println("Ce chiffre est impair");
            }
        }


        public static void max() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisie le premier entier");
            int a = scanner.nextInt();
            System.out.println("Saisie le deuxième entier");
            int b = scanner.nextInt();
            System.out.println("Le maximum est");
            if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }

        public static void min() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisie le premier entier");
            int a = scanner.nextInt();
            System.out.println("Saisie le deuxième entier");
            int b = scanner.nextInt();
            System.out.println("Le minimum est");
            if (a < b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
        public static void egaliteStr() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisie le premier caractère");
            String caractere = scanner.nextLine();
            System.out.println("Saisie le deuxieme caractere");
            String caractere2 = scanner.nextLine();
            boolean test = caractere.equals(caractere2);
            if(test){
                System.out.println("Les chaines de caractères sont identiques");
            }
            else {
                System.out.println("Les chaines de caractères ne sont pas identiques");
            }
        }
            public static void factorielle() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisir un entier positif ou nul");
            int n = scanner.nextInt();
            int factorielle = 1;
            for (int i = 1; i <= n; i++) {
                factorielle *= i;
            }
            System.out.println(n + "! = " + factorielle);
        }
        public static void countdown(){
            Scanner scanner = new Scanner(System.in);
            for (int i = 10; i > 0; i--){
                System.out.println(i);
            }
            System.out.println("BOOM");
        }
        public static void carres() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Saisie un nombre");
            float x = scanner.nextFloat();
                System.out.println(x + " " + x*x);
        }

        public static void tableMultiplication() {
            for (int j = 1; j<= 10; j++){
                System.out.println("");;
                for (int i = 1; i<= 10; i++){
                    System.out.println(i*j + "\t");
                }
            }

        }

        public static void division() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisie un premier entier");
            int a = scanner.nextInt();
            int b;
            do {System.out.println("Saisie un deuxième entier");
                b = scanner.nextInt();
            }while (b < 0);
            System.out.println("la division est égale à " + a/b);
        }

        public static void regle() {
            Scanner scanner = new Scanner(System.in);
            int a;
            do {
                System.out.println("Saisie un entier");
                a = scanner.nextInt();
            } while (a < 0);
            for (int i = 0; i <= a; i++) {
                if (i == 0 || i % 10 == 0) {
                    System.out.println("|");
                } else {
                    System.out.println("-");
                }
            }
        }

        public static void nombrePremier() {
            Scanner scanner = new Scanner(System.in);
            int a;
            do {
                System.out.println("Saisie un entier");
                a = scanner.nextInt();
            } while (a < 0);
            int RC = (int) Math.floor(Math.sqrt(a));
            for(int i = 2; i <= RC; i++){
                if (a%i==0){
                    System.out.println("l'entier "+a+" est divisible par " +i);
                    return;
                }
            }
            System.out.println("le nombre est premier");
        }*/
    public static void initialisationTableau() {
        int[] tableau = new int[20];
        int nbPair = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            if (entier % 2 == 0) {
                nbPair += 1;
            }
            tableau[i] = entier;
        }
        int min = tableau[0];
        int max = tableau[0];
        int sum = 0;
        int[] tabIndicePair = new int[10];
        for (int i = 0; i < 10; i++) {
            tabIndicePair[i] = tableau[i * 2];
        }
        int[] tabPair = new int[nbPair];
        int inTabPair = 0;
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] % 2 == 0) {
                tabPair[inTabPair] = tableau[i];
                inTabPair += 1;
            }
            sum += tableau[i];
            if (tableau[i] < min) {
                min = tableau[i];
            }
            if (tableau[i] < max) {
                max = tableau[i];
            }
        }
        System.out.println("Le minimum est " + min +" et le max est " + max + " , la somme des éléments du tableau est " + sum);
       // System.out.println("Tableau des elements pairs : " + (tabPair));
    }
}



