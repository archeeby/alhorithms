package patterns.structural.adapter;

/* concrete class implementing the AdvancedMediaPlayer */

public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {
        System.out.println("Playing vlc file. Name: "+ filename);
    }

    @Override
    public void playMP4(String filename) {
        //do nothing
    }
}