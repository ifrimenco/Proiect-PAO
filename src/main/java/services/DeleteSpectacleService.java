package main.java.services;

import main.java.model.Spectacle;
import main.java.repositories.SpectacleRepository;

public class DeleteSpectacleService {
    private LogService logService = LogService.getInstance();
    private SpectacleRepository spectacles = SpectacleRepository.getInstance();
    public void deleteSpectacle(Spectacle spectacle) {
        spectacles.deleteSpectacle(spectacle);
        logService.createLog("deleteSpectacle");
    }
}
