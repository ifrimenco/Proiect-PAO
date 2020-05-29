package main.java.model;

public final class Booking {
    private Client client;
    private Spectacle spectacle;
    private Row row;
    private Seat seat;
    private float price;
    private int zone;
    public Booking(Client client, Spectacle spectacle, Row row, Seat seat, int zone) {
        this.client = client;
        this.spectacle = spectacle;
        this.row = row;
        this.seat = seat;
        this.zone = zone; // 0 - groundfloor / 1 - balcony1 / 2 - balcony2
        this.price = this.spectacle.getTheatre().computePrice(zone, row.getNumber());
        if (this.client.isRegular()) {
            price = price * 8 / 10;
        }

    }

    // getter and setter methods
    public Client getClient() {
        return client;
    }



    public void setRow(Row row) {
        this.row = row;
    }


    public Row getRow() {
        return row;
    }

    public Seat getSeat() {
        return seat;
    }

    public Spectacle getSpectacle() {
        return spectacle;
    }

    public float getPrice() {
        return price;
    }

    public int getZone() {
        return zone;
    }
}
