package main.java.model;

public class Balcony extends Zone {
    public Balcony() {
        super.noOfRows = 5;
        super.rows = new Row[noOfRows];
    }

    @Override
    public int computePrice(int number) {
        return (11 - number) * 2;
    }
}
