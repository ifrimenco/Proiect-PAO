package main.java.model;

public class Seat {
    private boolean free = true;
    private int number;

    public Seat(int number) {
        this.number = number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void book() {
        free = false;
    }
    public boolean isFree() {
        return free;
    }

    public int getNumber() {
        return number;
    }
}
