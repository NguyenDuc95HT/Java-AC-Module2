package pointMoveablePoint;

public class moveablePoint extends point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public moveablePoint() {

    }

    public moveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public moveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        return new float[] {getxSpeed(), getySpeed()};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + "), speed = (" + getxSpeed() + ", " + getySpeed() + ")";
    }

    public moveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
class testMoveablePoint {
    public static void main(String[] args) {
        moveablePoint p = new moveablePoint(1, 2, 3,4);
        System.out.println(p.toString());
        p.move();
        System.out.println(p.toString());

    }
}