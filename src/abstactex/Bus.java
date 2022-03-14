package abstactex;

public class Bus extends Car{

    public Bus() {
        super("버스");
    }

    @Override
    public void refuel() {
        System.out.println("천연가스를 주유합니다.");
    }

    public void takePassenger(){
        System.out.println("승객을 버스에 태웁니다.");
    }
}
