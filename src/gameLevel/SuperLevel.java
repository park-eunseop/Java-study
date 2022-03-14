package gameLevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("running soo fast");
    }

    @Override
    public void jump() {
        System.out.println("jumping soo high");
    }

    @Override
    public void turn() {
        System.out.println("turning once");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("It is Super Level.");
    }
}
