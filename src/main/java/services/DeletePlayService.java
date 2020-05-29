package main.java.services;

import main.java.model.Play;
import main.java.repositories.PlayRepository;

public class DeletePlayService {
    private LogService logService = LogService.getInstance();
    private PlayRepository plays = PlayRepository.getInstance();
    public void deletePlay(Play play) {
        plays.deletePlay(play);
        logService.createLog("DeletePlay");
    }
}
