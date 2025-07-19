package Interface.Example3;

public class MediaApp {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer videoPlayer = new VideoPlayer();

        audioPlayer.play();   // Output: Audio player is playing
        audioPlayer.pause();  // Output: Audio player is paused
        audioPlayer.stop();   // Output: Audio player is stopped

        videoPlayer.play();   // Output: Video player is playing
        videoPlayer.pause();  // Output: Video player is paused
        videoPlayer.stop();   // Output: Video player is stopped

    }
}
