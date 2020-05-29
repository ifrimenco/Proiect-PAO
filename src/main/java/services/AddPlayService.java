package main.java.services;

import main.java.model.Play;
import main.java.repositories.PlayRepository;

public class AddPlayService {
    private LogService logService = LogService.getInstance();
    private PlayRepository plays = PlayRepository.getInstance();

    public void addPlay(Play play) {
        plays.addPlay(play);
        logService.createLog("AddPlay");
    }
}
