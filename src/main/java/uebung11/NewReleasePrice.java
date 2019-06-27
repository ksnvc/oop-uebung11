package uebung11;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

   public double getCharge(int daysRented){
        return daysRented * 3;
    }

    public double getFrequentRenterPoints(int daysRented){
        if( daysRented > 1)
            return 2;
        else
            return 1;
    }
}
