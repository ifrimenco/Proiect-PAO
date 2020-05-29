package main.java.services;

import main.java.model.Booking;
import main.java.model.Spectacle;
import main.java.repositories.ClientRepository;

public class DeleteBookingService {
    private LogService logService = LogService.getInstance();
    private ClientRepository clients = ClientRepository.getInstance();
    public void deleteBooking(Booking booking) {
        booking.getSpectacle().deleteBooking(booking);
        logService.createLog("DeleteBooking");
    }
}
