package main.java.model;

public class Theatre {
    private Zone[] zones;

    private Theatre() {
        zones = new Zone[3];
        zones[0] = new GroundFloor();
        zones[1] = new Balcony();
        zones[2] = new Balcony();
    }

    public void bookSeat(int rowNumber, int seatNumber, int zone) {
        zones[zone].rows[rowNumber].getSeat(seatNumber).book();
    }

    public float computePrice(int zone, int row) {
        return zones[zone].computePrice(row);
    }
    public void printSeats() {
        for (int i = 0; i < 2; ++i) {
            if (i == 0) System.out.println("Ground Floor: ");
            else System.out.println("Balcony "+ i + ":");
            zones[i].printSeats();
        }
    }
}
