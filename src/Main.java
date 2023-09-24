public class Main {
    public static void main(String[] args)
    {
        double price_of_purchase = 0.0;
        double SALES_TAX = 0.05;
        double tax_value = 0.0;


        System.out.println("Enter the price of your item: ");
        price_of_purchase = 12.50;
        tax_value = price_of_purchase * SALES_TAX;

        System.out.println("The price of the item is " + price_of_purchase + " and the sales tax is " + tax_value + ".");

    }
}