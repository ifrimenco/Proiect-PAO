package main.java.model;

public class Row {
    private int number;
    private Seat[] seats = new Seat[15];

    public Row(int number) {
        this.number = number;
        for (int i = 0; i < 15; ++i)
            seats[i].setNumber(i);
    }
    public void printSeats() {
        for (int i = 0; i < 15; ++i) {
            if (seats[i].isFree()) {
                System.out.print("O");
            }
            else {
                System.out.print("X");
            }
        }
    }
    public void setSeat(int number, Seat seat) {
        this.seats[number] = seat;
    }

    public Seat getSeat(int number) {
            if (number <= 0 || number > 15) {
                throw new IndexOutOfBoundsException(number + " is out of bounds!");
            }
            return seats[number - 1];
    }

    public int getNumber() {
        return number;
    }
}
