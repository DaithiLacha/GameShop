package singleton;

/*
 * David O'Connor
 * Software Design Patterns CA - GameShop
 * github link: https://github.com/DaithiLacha/GameShop
 */


public class testSingleton {
    public static void main(String[] args) {
        PrinterSingleton printer = PrinterSingleton.getInstance();
        PrinterSingleton printer2 = PrinterSingleton.getInstance();

        printer.printJob(10);
        printer2.printJob(15);
        printer.fillPrinter();
        printer2.fillPrinter();
        printer.printJob(25);
        printer2.printJob(120);
    }
}
