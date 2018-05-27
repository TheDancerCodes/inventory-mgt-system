package inventory_system;


import java.awt.event.KeyEvent;

// TODO: 3 - Class to calculate the tax
public class TaxCalculator {

    public double taxRate = 0.90;

    public Double calculateTax(double amount) {

        double myTax = amount - (amount * taxRate);
        return myTax;
    }

    public void clearText(java.awt.event.KeyEvent evt) {
        // TODO 6b: Add code to restrict entry to numbers

        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }

}
