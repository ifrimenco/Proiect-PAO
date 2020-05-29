package main.java.services;

import main.java.model.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ActionsMenuService {
    private AddBookingService addBookingService = new AddBookingService();
    private DeleteBookingService deleteBookingService = new DeleteBookingService();
    private AddPlayService addPlayService = new AddPlayService();
    private DeletePlayService deletePlayService = new DeletePlayService();
    private AddSpectacleService addSpectacleService = new AddSpectacleService();
    private DeleteSpectacleService deleteSpectacleService = new DeleteSpectacleService();
    private PrintClientService printClientService = new PrintClientService();
    private PrintSeatsService printSeatsService = new PrintSeatsService();
    private PrintSpectacleService printSpectacleService = new PrintSpectacleService();


    public void run() {
        int action = 0;
        Scanner input = new Scanner(System.in);
        do {
            action = input.nextInt();
            String playName, stringDate, clientName, clientEmail, clientPhone;
            int duration, rowNumber, seatNumber, zone;
            Play play;
            Spectacle spectacle;
            Seat seat;

            switch (action) {
                case 1:
                    playName = input.next();
                    duration = input.nextInt();
                    play = new Play(playName, duration);
                    addPlayService.addPlay(play);
                    break;
                case 2:
                    playName = input.next();
                    duration = input.nextInt();
                    play = new Play(playName, duration);
                    deletePlayService.deletePlay(play);
                    break;
                case 3:
                    stringDate = input.next();
                    playName = input.next();
                    duration = input.nextInt();
                    play = new Play(playName, duration);
                    spectacle = new Spectacle(stringDate, play);
                    addSpectacleService.addSpectacle(spectacle);
                    break;
                case 4:
                    stringDate = input.next();
                    playName = input.next();
                    duration = input.nextInt();
                    play = new Play(playName, duration);
                    spectacle = new Spectacle(stringDate, play);
                    deleteSpectacleService.deleteSpectacle(spectacle);
                    break;
                case 5:
                    clientName = input.next();
                    clientEmail = input.next();
                    clientPhone = input.next();
                    Client client = new Client(clientName, clientEmail, clientPhone);
                    stringDate = input.next();
                    playName = input.next();
                    duration = input.nextInt();
                    play = new Play(playName, duration);
                    spectacle = new Spectacle(stringDate, play);
                    rowNumber = input.nextInt();
                    Row row = new Row(rowNumber);
                    seatNumber = input.nextInt();
                    seat = new Seat(seatNumber);
                    zone = input.nextInt();
                    Booking booking = new Booking(client, spectacle, row, seat, zone);
                    addBookingService.addBooking(booking);
                    break;
                case 6:
                    clientName = input.next();
                    clientEmail = input.next();
                    clientPhone = input.next();
                    client = new Client(clientName, clientEmail, clientPhone);
                    stringDate = input.next();
                    playName = input.next();
                    duration = input.nextInt();
                    play = new Play(playName, duration);
                    spectacle = new Spectacle(stringDate, play);
                    rowNumber = input.nextInt();
                    row = new Row(rowNumber);
                    seatNumber = input.nextInt();
                    seat = new Seat(seatNumber);
                    zone = input.nextInt();
                    booking = new Booking(client, spectacle, row, seat, zone);
                    deleteBookingService.deleteBooking(booking);
                    break;
                case 7:
                    printClientService.PrintClients();
                    break;
                case 8:
                    printSpectacleService.PrintSpectacles();
                    break;
                case 9:
                    stringDate = input.next();
                    playName = input.next();
                    duration = input.nextInt();
                    play = new Play(playName, duration);
                    spectacle = new Spectacle(stringDate, play);
                    printSeatsService.PrintSeats(spectacle);
                    break;
            }
        } while (action != 0);
    }
}
