package object;

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

/**
 * Cloneable 객체를 복제해도 된다는 의미로 Cloneable 인터페이스를 함께 선언
 */
class Circle implements Cloneable {
    Point point;
    int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class ObjectCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(10, 20);
        Circle circle = new Circle(point,30);

        Circle clone = (Circle) circle.clone();
        System.out.println(circle);
        System.out.println(clone);  //toString 오버라이딩


        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(clone));
    }
}
