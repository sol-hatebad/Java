import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
static String input;
static String[] rowArray = new String[15];

    public static void main(String[] args) throws IOException {
        selectData();
        dataToArray();
    }

    public static void selectData() throws IOException {
        Scanner ScanObj = new Scanner(System.in);
        System.out.println("Wie heißt die Datei?");
        input = ScanObj.nextLine();
        System.out.println("Der Name der Datei lautet: " + input);
        System.out.println("------------------------------------\n");


    }

    public static void dataToArray()throws IOException{
        int countWords = 0;
        String zeile = " ";
        FileReader fr = new FileReader(input);
        BufferedReader br = new BufferedReader(fr);

        while ((zeile = br.readLine()) != null) {
            int i = 0;
            rowArray = zeile.split(" ");
            rowArray[i] = Arrays.toString(rowArray);
            System.out.println(zeile);
            countWords = countWords + rowArray.length;

        }
            System.out.println();
            for (String element : rowArray[1,2,3] {
                System.out.println(element);
            }
            br.close();
            System.out.println("\nDer Text enthält "+ countWords+" Wörter!");




    }
}