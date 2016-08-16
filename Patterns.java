import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by user-2 on 12/8/16.
 */
public class Patterns {
        public static final Scanner  CONSOLE = new Scanner(System.in);

        public static void main(String argv[]) throws FileNotFoundException {
            System.out.println("Project 1 written by Siddhartha");
            Patterns patterns = new Patterns();


            patterns.drawPatternsOfTextTiles(patterns.drawBox());

        }

    public void drawPatternsOfTextTiles(PrintWriter printWriter) {
        System.out.println("Enter widhth of pattern :");
        int width = CONSOLE.nextInt();
        System.out.println("Enter height of pattern :");
        int height = CONSOLE.nextInt();
        printWriter.print(" __");
        for(int i=1;i<width;i++){
            printWriter.print("    __");
        }
        printWriter.print("\n");
        for(int i=1;i<=height;i++){
            for(int j=1;j<=width;j++){
                printWriter.print("/  \\__");
            }
            printWriter.print("\n");
            for(int j=1;j<=width;j++){
                printWriter.print("\\__/  ");
            }
            printWriter.print("\n");
        }
        printWriter.close();
    }

    public PrintWriter drawBox() throws FileNotFoundException {
            System.out.println("Enter the number of boxes :");
            int noOfBoxes = CONSOLE.nextInt();
            PrintWriter printWriter = new PrintWriter(new File("PatternsOutput.txt"));
            printWriter.print("+");
            for(int i=1;i<=noOfBoxes;i++){
                printWriter.print("------+");
            }
            printWriter.print("\n");
            printWriter.print("|");
            for(int i=1;i<=noOfBoxes;i++){
                printWriter.print("      |");
            }
            printWriter.print("\n");
            printWriter.print("|");
            for(int i=1;i<=noOfBoxes;i++){
                printWriter.print("      |");
            }
            printWriter.print("\n");
            printWriter.print("+");
            for(int i=1;i<=noOfBoxes;i++){
                printWriter.print("------+");
            }
            printWriter.print("\n");
        return  printWriter;
        }


}
