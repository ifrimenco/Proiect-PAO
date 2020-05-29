package main.java.services;

import main.java.model.Spectacle;
import main.java.repositories.SpectacleRepository;

import javax.lang.model.element.Element;

public class PrintSpectacleService {
    private LogService logService = LogService.getInstance();
    private SpectacleRepository spectacles = SpectacleRepository.getInstance();
    public void PrintSpectacles() {
        for (Spectacle spectacle : spectacles.getSpectacles()) {
            System.out.println(spectacle);
        }
        logService.createLog("PrintSpectacle");
    }
}
