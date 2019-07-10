public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(2);
        point.setY(3);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(3,3,1,1);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
