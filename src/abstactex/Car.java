package abstactex;

public abstract class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name+"가 달립니다.");
    }

    public abstract void refuel();

    public void stop(){
        System.out.println(name+"가 멈춥니다.");
    };
}
