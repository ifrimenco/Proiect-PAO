package main.java.model;

abstract class Zone {
    public abstract int computePrice(int number);
    protected Row[] rows;
    protected int noOfRows;

    public Row getRow(int number) {
        if (number <= 0 || number > noOfRows) {
            throw new IndexOutOfBoundsException(number + " is out of bounds!");
        }
        return rows[number - 1];
    }
    public void printSeats() {
        for (int i = 0; i < noOfRows; ++i) {
            rows[i].printSeats();
        }
    }

}
