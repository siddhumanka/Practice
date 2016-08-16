import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;




public class MetricConversion {
    public static final Scanner CONSOLE = new Scanner(System.in);
    public static void main(String argv[]) throws FileNotFoundException {
        System.out.println("Project 2 written by Siddhartha ");
        MetricConversion metricConversion = new MetricConversion();
        metricConversion.writeInchesToFeetsTable(metricConversion.convertKilosToPounds());

    }

    public void writeInchesToFeetsTable(PrintWriter printWriter) {
        printWriter.print("Conversion of Inches and Feets to Metres:");
        printWriter.print("\n");
        printWriter.print("\t     Inches\t");
        printWriter.print("\n");
        printWriter.print("Feets    ");
        for(int i = 0;i<=11;i++){
            printWriter.print(i+"\t         ");
        }
        printWriter.print("\n");

        for(int i=0;i<=9;i++){
            printWriter.print(i);
            for(int j=0;j<=11;j++){
                printWriter.printf("\t     %.4f",((i*12)+j)*0.0254);
            }
            printWriter.print("\n");
        }
        printWriter.close();
    }


    public PrintWriter convertKilosToPounds() throws FileNotFoundException {
        System.out.println("Enter the lowest number ");
        int lowerBound = CONSOLE.nextInt();
        System.out.println("Enter the highest number ");
        int higherBound = CONSOLE.nextInt();
        PrintWriter printWriter = new PrintWriter(new File("MetircConversionOutput.txt"));
        printWriter.print("Conversion of given range of Kilos into Pounds :");
        printWriter.print("\n");
        printWriter.print("Kilos    Pounds");
        printWriter.print("\n");
        for(int i=lowerBound;i<=higherBound;i++){
            printWriter.print(i+"        ");
            printWriter.printf("%.4f",(i / 0.45359237));
            printWriter.print("\n");
        }
         printWriter.print("\n");
         return printWriter;
    }
}
