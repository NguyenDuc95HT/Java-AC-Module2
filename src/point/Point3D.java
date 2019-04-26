package point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D () {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}

class testPoint3D {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 5, 8);
        System.out.println(p3);
    }
}
