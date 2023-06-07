import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class  Main
{


    public static void main(String[] args) throws IOException {
        int countWords;
        int i=0;
        String[] generatedVariables = new String[20];
        String[] wordArray;
        System.out.println("Öffne Datei 'test.txt' \n");
        //Scanner ScanObj = new Scanner(System.in);
        //System.out.println("Wie heißt die Datei?");
        //String input = ScanObj.nextLine();
        // System.out.println("Der Name der Datei lautet: "+input);
        //System.out.println("------------------------------------\n");
        //FileReader fr = new FileReader(input);                                                                      */
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String  zeile = "";

        while ((zeile = br.readLine()) != null)                                                                     //Schleife zum Zählen der Wörter
        {   i++;

            wordArray=zeile.split(" ");
            generatedVariables[i] = zeile;
            System.out.println(zeile);
            countWords=countWords + wordArray.length;

        }
        System.out.println();
        for (String element : generatedVariables) {
            System.out.println(element);
        }
        br.close();
        System.out.println("\nDer Text enthält "+ countWords+" Wörter!");



    }


}