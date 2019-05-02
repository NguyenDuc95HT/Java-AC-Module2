package pointMoveablePoint;

public class point {
    float x = 0.0f;
    float y = 0.0f;

    public point() {

    }

    public point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void  setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        return new float[] {getX(), getY()};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", "+ getY() + ")";
    }
}
