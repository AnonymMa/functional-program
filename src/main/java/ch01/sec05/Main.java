package ch01.sec05;

public class Main {

    public static void main(String[] args) {
        ReceiptPrinter simplePrinter = new ReceiptPrinter() {
            @Override
            public void print(Receipt receipt) {
                System.out.println("\nItem:\t" + receipt.item);
                System.out.println("Price:\t" + receipt.price);
                System.out.println("Disc:\t" + receipt.discount);
                System.out.println("Tax:\t" + receipt.tax);
                System.out.println("Total:\t" + computeTotal(receipt));
            }
        };

        ReceiptPrinter exemptPrinter = new ReceiptPrinter() {
            @Override
            public void print(Receipt receipt) {
                System.out.println("\nItem:\t" + receipt.item);
                System.out.println("Price:\t" + receipt.price);
                System.out.println("Disc:\t" + receipt.discount);
                System.out.println("Total:\t" + computeTotal(receipt));
            }

            @Override
            public double computeTotal(Receipt receipt) {
                return receipt.price - receipt.price * receipt.discount;
            }
        };

        Receipt receipt = new Receipt("shirt", 20.00, 0.05, 0.07);
        simplePrinter.print(receipt);
        exemptPrinter.print(receipt);
    }
}
