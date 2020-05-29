package main.java.repositories;

import main.java.model.Spectacle;

import java.util.Set;
import java.util.TreeSet;

public class SpectacleRepository {
    private Set<Spectacle> spectacles = new TreeSet<Spectacle>();

    public void addSpectacle(Spectacle spectacle) {
        spectacles.add(spectacle);
    }

    public void deleteSpectacle(Spectacle spectacle) {
        spectacles.remove(spectacle);
    }

    public Set<Spectacle> getSpectacles() {
        return spectacles;
    }
    public static SpectacleRepository getInstance() {
        return SpectacleRepository.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SpectacleRepository INSTANCE = new SpectacleRepository();
    }
}
