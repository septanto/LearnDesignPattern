package learn.dp.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "don't stop me now.mp3");
        audioPlayer.play("mp4", "bohemian rhapsody.mp4");
        audioPlayer.play("vlc", "killer queen.vlc");
        audioPlayer.play("avi", "another one bites the dust.avi");
    }
}
