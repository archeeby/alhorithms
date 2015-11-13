package patterns.structural.adapter;

/* interface to play various formats */

public interface MediaPlayer {
    public void play(String audioType, String fileName);
}