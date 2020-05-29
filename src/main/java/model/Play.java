package main.java.model;

public final class Play {
    private String name;
    private int duration;


    public Play(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }
    public String getName() {
        return name;
    }

}
