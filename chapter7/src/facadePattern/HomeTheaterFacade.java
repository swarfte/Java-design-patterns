package facadePattern;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    StreamingPlayer player;
    Screen screen;
    PopcornPopper popcornPopper;
    Projector projector;
    TheaterLights theaterLights;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, StreamingPlayer player, Screen screen, PopcornPopper popcornPopper, Projector projector, TheaterLights theaterLights) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.player = player;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.theaterLights = theaterLights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }
}
