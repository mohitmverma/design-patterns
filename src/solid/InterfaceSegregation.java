package solid;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionPrinter implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}


// Here, SimplePrinter is not forced to implement the scan method.