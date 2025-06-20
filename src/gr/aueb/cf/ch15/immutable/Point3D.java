package gr.aueb.cf.ch15.immutable;

public final class Point3D {
    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(int z, Point point) {
        this.z = z;
        this.point = new Point(point.getX(), point.getY());
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }

    public int getZ() {
        return z;
    }
}
