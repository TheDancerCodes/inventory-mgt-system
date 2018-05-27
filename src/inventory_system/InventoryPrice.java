package inventory_system;

public class InventoryPrice {

    // Declaring the variables of items in the Inventory
    public double Rice;
    public double Celery;
    public double Carrots;
    public double Onions;
    public double Corriander;

    public double Gin;
    public double Rum;
    public double Wine;
    public double Vodka;
    public double Whiskey;

    public double Tea;
    public double Cola;
    public double Coffee;
    public double Oranges;
    public double BottleWater;

    public double MilkShake;
    public double IceCream;
    public double Almonds;
    public double Pistachio;
    public double Chocolate;

    // Variables to store the value of items per group
    public double itemTotal1;
    public double itemTotal2;
    public double itemTotal3;
    public double itemTotal4;

    public double itemGrandTotal;

    // Method to add all the items together.
    public double getAmount() {

        itemTotal1 = Rice + Celery + Carrots + Onions + Corriander;
        itemTotal2 = Gin + Rum + Wine + Vodka + Whiskey;
        itemTotal3 = Tea + Cola + Coffee + Oranges + BottleWater;
        itemTotal4 = MilkShake + IceCream + Almonds + Pistachio + Chocolate;

        itemGrandTotal = itemTotal1 + itemTotal2 + itemTotal3 + itemTotal4;

        return(itemGrandTotal);
    }

    // Determine price of each item
    public double priceRice = 35.08;
    public double priceCelery = 6.10;
    public double priceCarrots = 10.35;
    public double priceOnions = 12.20;
    public double priceCorriander = 13.01;

    public double priceGin = 140.00;
    public double priceRum = 310.00;
    public double priceWine = 200.00;
    public double priceVodka = 210.00;
    public double priceWhiskey = 460.00;

    public double priceTea = 150.00;
    public double priceCola = 75.00;
    public double priceCoffee = 125.00;
    public double priceOranges = 65.00;
    public double priceBottleWater = 40.00;

    public double priceMilkShake = 270.00;
    public double priceIceCream = 240.00;
    public double priceAlmonds = 35.75;
    public double pricePistachio = 27.00;
    public double priceChocolate = 180.00;

}
