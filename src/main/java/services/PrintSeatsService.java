package main.java.services;

import main.java.model.Spectacle;
import main.java.repositories.SpectacleRepository;

import java.util.Iterator;

public class PrintSeatsService {

    private LogService logService = LogService.getInstance();

    private SpectacleRepository spectacles = SpectacleRepository.getInstance();
    public void PrintSeats(Spectacle spectacle) {

        logService.createLog("PrintSeats");

        for (Iterator<Spectacle> it = spectacles.getSpectacles().iterator(); it.hasNext();) {
            Spectacle spec = it.next();
            if (spectacle.equals(spec)) {
                spec.printSeats();
            }
        }
    }
}
