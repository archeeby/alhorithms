package patterns.structural.adapter;

/* concrete class implementing the AdvancedMediaPlayer */

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {
        //do nothing
    }

    @Override
    public void playMP4(String filename) {
        System.out.println("Playing mp4 file. Name: "+ filename);
    }
}