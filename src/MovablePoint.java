public class MovablePoint extends Point{
    private int xSpeed = 0;
    private int ySpeed = 0;

    public MovablePoint() {
    }

    public MovablePoint(int xSpeed, int ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    public int[] getSpeed(){
        int[] speed = {xSpeed,ySpeed};
        return speed;
    }
    public void setSpeed(int xSpeed, int ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "toa do la (" + getX() +","+getY() +")"
                + "speed:" + xSpeed + ","+ySpeed;
    }
    public String move(){
        int x1 = getX()+xSpeed;
        int y1 = getY()+ySpeed;
        return "new postion is "+ x1 + ","+ y1;

    }
}
