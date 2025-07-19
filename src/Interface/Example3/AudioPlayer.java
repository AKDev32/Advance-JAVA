package Interface.Example3;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Audio player is playing");
    }

    @Override
    public void pause() {
        System.out.println("Audio player is paused");
    }

    @Override
    public void stop() {
        System.out.println("Audio player is stopped");
    }
}
