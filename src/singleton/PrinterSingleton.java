package singleton;

public class PrinterSingleton {
    private volatile static PrinterSingleton uniquePrinter;
    private boolean isEmpty ;
    private int sheetsInPrinter;

    private PrinterSingleton() {
        isEmpty = true;
        sheetsInPrinter = 0;
    }

    public static synchronized PrinterSingleton getInstance() {
        if (uniquePrinter == null) {
            System.out.println("Creating unique instance of Printer");
            uniquePrinter = new PrinterSingleton();
        }
        return uniquePrinter;
    }

    public static PrinterSingleton getUniquePrinter() {
        return uniquePrinter;
    }

    public static void setUniquePrinter(PrinterSingleton uniquePrinter) {
        PrinterSingleton.uniquePrinter = uniquePrinter;
    }

    public void fillPrinter() {
        if(isEmpty) {
            sheetsInPrinter += 100;
            isEmpty = false;
        }
    }

    public void printJob(int numOfSheets) {
        for (int i = 0; i < numOfSheets; i++) {
            if(sheetsInPrinter >= 1) {
                sheetsInPrinter--;
            }else {
                isEmpty = true;
                System.out.println("Printer is Empty. Please refill!");
                return;
            }
        }
        System.out.println("Job complete. \nPrinter volume: " + numOfSheets + " sheets");
    }
}
