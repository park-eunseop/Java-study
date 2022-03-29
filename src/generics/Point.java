package generics;

/**
 * 자료형 매개변수를 두 개 사용하는 클래스
 *
 * @param <T>
 * @param <V>
 */
public class Point<T, V> {
    T x;
    V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX(){
        return x;
    }

    public V getY(){
        return y;
    }
}
