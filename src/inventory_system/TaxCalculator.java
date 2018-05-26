package inventory_system;


// TODO: 3 - Class to calculate the tax
public class TaxCalculator {

    public double taxRate = 0.90;

    public Double calculateTax(double amount) {

        double myTax = amount - (amount * taxRate);
        return myTax;
    }

}
