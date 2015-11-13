package patterns.structural.adapter;

/* adapter class implementing the MediaPlayer interface */

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;
    public static final String VLC_TYPE = "vlc";
    public static final String MP4_TYPE = "mp4";

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(VLC_TYPE)) {
            advancedMediaPlayer = new VLCPlayer();
        } else if (audioType.equalsIgnoreCase(MP4_TYPE)) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase(VLC_TYPE)) {
            advancedMediaPlayer.playVLC(fileName);
        } else if (audioType.equalsIgnoreCase(MP4_TYPE)) {
            advancedMediaPlayer.playMP4(fileName);
        }
    }
}