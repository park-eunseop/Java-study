package gameLevel;

public class AdvanceLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Running fast!");
    }

    @Override
    public void jump() {
        System.out.println("Jumping high");
    }

    @Override
    public void turn() {
        System.out.println("I don't know how to turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("It's advanced level.");
    }
}
