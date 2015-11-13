package patterns.structural.adapter;

/* concrete class implementing the MediaPlayer interface */

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    private final String MP3_TYPE = "mp3";


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase(MP3_TYPE)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase(MediaAdapter.VLC_TYPE) || audioType.equalsIgnoreCase(MediaAdapter.MP4_TYPE)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}