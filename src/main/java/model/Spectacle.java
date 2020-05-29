package main.java.model;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Spectacle implements Comparable<Spectacle>{
    private Date date;
    private Play play;
    private List<Booking> bookings = new ArrayList<>();
    private Theatre theatre;
    public Spectacle(String date, Play play) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        try {
            this.date = formatter.parse(date);
        }
        catch (Exception e) {
            System.out.println("PARSING FAILED");
        }
        this.play = play;
    }

    public Theatre getTheatre() {
        return theatre;
    }
    public void addBooking(Booking booking) {
        bookings.add(booking);
        theatre.bookSeat(booking.getRow().getNumber(), booking.getSeat().getNumber(), booking.getZone());
    }

    public void deleteBooking(Booking booking) {
        bookings.remove(booking);
    }
    public Date getDate() {
        return date;
    }

    public Play getPlay() {
        return play;
    }

    public void printSeats() {
        theatre.printSeats();
    }
    @Override
    public int compareTo(Spectacle spectacle) {
        return date.compareTo(spectacle.date);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Spectacle spectacle = (Spectacle) obj;
        if (play != null ? !play.equals(spectacle.play) : spectacle.play != null) return false;
        return date != null ? !date.equals(spectacle.date) : spectacle.date == null;
    }
}
