package main.java.services;

import main.java.model.Spectacle;
import main.java.repositories.SpectacleRepository;

public class AddSpectacleService {
    private LogService logService = LogService.getInstance();
    private SpectacleRepository spectacles = SpectacleRepository.getInstance();
    public void addSpectacle(Spectacle spectacle) {
        spectacles.addSpectacle(spectacle);
        logService.createLog("AddSpectacle");
    }
}
