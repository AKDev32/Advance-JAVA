package Interface.Example3;

public class VideoPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Video player is playing");
    }

    @Override
    public void pause() {
        System.out.println("Video player is paused");
    }

    @Override
    public void stop() {
        System.out.println("Video player is stopped");
    }
}
