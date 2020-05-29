package main.java.repositories;

import main.java.model.Play;

import java.util.ArrayList;
import java.util.List;

public class PlayRepository {
    private List<Play> plays = new ArrayList<>();

    public void addPlay(Play play) {plays.add(play);}
    public void deletePlay(Play play) {plays.remove(play);}

    public static PlayRepository getInstance() {
        return PlayRepository.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final PlayRepository INSTANCE = new PlayRepository();
    }
}
