import java.util.Scanner;


class Main {
    public static void main(String [] args) {

        float zahl1 = 0;
        float zahl2 = 0;
        float ergebnis= 0 ;
        int operation = 0;
        String yn = "y";

        for (; yn.equals("y"); ) {

            System.out.println("Dies ist ein Taschenrechner für einfache Operationen.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben sie die erste Zahl ein: ");
            zahl1 = scanner.nextFloat();
            System.out.println("Geben sie die zweite Zahl ein: ");
            zahl2 = scanner.nextFloat();
            System.out.println("Welche Operation wollen sie durchführen? ");
            System.out.println("Addition(1), Division(2), Subtraktion(3), Multiplikation(4) oder Modulo(5)");
            operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println("Die erste Zahl (" + zahl1 + ") PLUS die zweite Zahl (" + zahl2 + ")");
                ergebnis = zahl1 + zahl2;
                System.out.println("ergibt : " + ergebnis);
            } else if (operation == 2) {
                System.out.println("Die erste Zahl (" + zahl1 + ") DURCH die zweite Zahl (" + zahl2 + ")");
                ergebnis = zahl1 / zahl2;
                System.out.println("ergibt: " + ergebnis);
            } else if (operation == 3) {
                System.out.println("Die erste Zahl (" + zahl1 + ") MINUS die zweite Zahl (" + zahl2 + ")");
                ergebnis = zahl1 - zahl2;
                System.out.println("ergibt: " + ergebnis);
            } else if (operation == 4) {
                System.out.println("Die erste Zahl (" + zahl1 + ") MAL die zweite Zahl (" + zahl2 + ")");
                ergebnis = zahl1 * zahl2;
                System.out.println("ergibt: " + ergebnis);

            } else if (operation == 5) {
                System.out.println("Der MODULO der ersten Zahl (" + zahl1 + ")  von der zweiten Zahl (" + zahl2 + ")");
                ergebnis = zahl1 % zahl2;
                System.out.println("ergibt das MODULA: " + ergebnis);
            }
            System.out.println("möchten sie weitere berechnungen durchführen?(y/n)");
            yn = scanner.next();

        }
    /*    System.out.println(zahl1);
        System.out.println(zahl2);
        System.out.println(operation); */
    } // Ende main-Methode
} // Ende Klasse