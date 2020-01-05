package singleton;

public class testSingleton {
    public static void main(String[] args) {
        PrinterSingleton printer = PrinterSingleton.getInstance();

        printer.printJob(10);
        printer.fillPrinter();
        printer.printJob(25);
    }
}
