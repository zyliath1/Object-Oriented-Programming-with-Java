public class DiamondThread implements Runnable {
    private PrintDiamond diamondPrinter;

    public DiamondThread(PrintDiamond diamondPrinter) {
        this.diamondPrinter = diamondPrinter;
    }

    @Override
    public void run() {
        diamondPrinter.print();
    }
}
