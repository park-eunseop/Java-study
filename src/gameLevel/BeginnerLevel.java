package gameLevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("I don't know how to jump ..");
    }

    @Override
    public void turn() {
        System.out.println("I don't know how to jump ..");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("It's beginner level.");
    }
}
