import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte einen Betrag in EUR eingeben: ");
        Double money = scanner.nextDouble();
        System.out.println(money+"€ entsprechen: ");
        convertToDollars(money);
        convertToYen(money);
        convertToPesos(money);
    }

    public static void convertToDollars(Double eur) {
        System.out.println(eur *1.2 +"$ (Dollar)");
    }
    public static void convertToYen(Double eur) {
        System.out.println(eur *146.63 +" Yen");
    }
    public static void convertToPesos(Double eur) {
        System.out.println(eur *19.72 +" Pesos");
    }
}
