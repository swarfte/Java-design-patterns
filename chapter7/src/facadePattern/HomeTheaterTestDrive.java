package facadePattern;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new StreamingPlayer(),
                new Screen(),
                new PopcornPopper(),
                new Projector(),
                new TheaterLights()
        );

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
