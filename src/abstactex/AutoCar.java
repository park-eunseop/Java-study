package abstactex;

public class AutoCar extends Car{

    public AutoCar() {
        super("차");
    }

    @Override
    public void refuel() {
        System.out.println("휘발유를 주유합니다.");
    }

    public void load(){
        System.out.println("짐을 싣습니다.");
    }


}
