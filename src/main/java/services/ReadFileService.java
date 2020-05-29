package main.java.services;

import main.java.model.*;
import main.java.repositories.SpectacleRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

import static java.lang.Integer.parseInt;

public class ReadFileService {
    private String PATH = "src/data/data.csv";
    private LogService logService = LogService.getInstance();
    public static ReadFileService getInstance() {
        return ReadFileService.SingletonHolder.INSTANCE;
    }

    private ReadFileService() {

    }
    public void Read() {
        String line = "";
        String splitBy = ",";
        // clientName, clientEmail, clientPhone, playName, duration, spectacleDate, rowNumber, seatNumber, zone
        // string[0],  string[1],   string[2],  string[3], string[4], string[5], string[6], string[7], string[8]
        try (BufferedReader buffer = new BufferedReader(new FileReader(PATH))) {
            line = buffer.readLine();
            while (line != null) {
                String[] string = line.split(splitBy);
                Client client = new Client(string[0], string[1], string[2]);
                Play play = new Play(string[3], parseInt(string[4]));
                Spectacle spectacle = new Spectacle(string[5], play);
                Row row = new Row(parseInt(string[6]));
                Seat seat = new Seat(parseInt(string[7]));
                Booking booking = new Booking(client, spectacle, row, seat, parseInt(string[8]));
                AddBookingService addBookingService = new AddBookingService();
                addBookingService.addBooking(booking);
                logService.createLog("ReadFileService");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static class SingletonHolder {
        private static final ReadFileService INSTANCE = new ReadFileService();
    }
}
