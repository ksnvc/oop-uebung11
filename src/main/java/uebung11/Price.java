package uebung11;

public abstract class Price {

   public abstract int getPriceCode();

   abstract double getCharge(int daysRented);

   public abstract double getFrequentRenterPoints(int daysRented);
}
