package patterns.structural.adapter;

/* interface to play VLC and MP4 only */

public interface AdvancedMediaPlayer {
    public void playVLC(String filename);
    public void playMP4(String filename);
}