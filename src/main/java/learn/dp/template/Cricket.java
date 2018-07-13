package learn.dp.template;

public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start Playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the Game");
    }
}
