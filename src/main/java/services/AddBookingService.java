package main.java.services;

import main.java.model.Booking;
import main.java.model.Spectacle;

public class AddBookingService {

    private LogService logService = LogService.getInstance();

    public void addBooking(Booking booking) {
        booking.getSpectacle().addBooking(booking);
        AddClientEntryService addClientEntryService = new AddClientEntryService();
        addClientEntryService.addEntry(booking.getClient());
        logService.createLog("addBooking");
    }
}
