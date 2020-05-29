package main.java.model;

public class GroundFloor extends Zone {
    public GroundFloor() {

        super.noOfRows = 10;
        super.rows = new Row[10];
    }

    @Override
    public int computePrice(int number) {
        return (16 - number) * 4;
    }
}
