package gr.aueb.cf.ch15.services;

public class PointMain {

    public static void main(String[] args) {
//        Point point = new Point();
//        Point2D point2D = new Point2D();
//        Point3D point3D = new Point3D();

        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();



//        p2.movePlusOne();
//        p2.movePlus10();
//
//        p3.movePlus10();
//
//        ((Point2D) p2).setY(15);

//        doMovePlus10(point);
//        doMovePlus10(point2D);
//        doMovePlus10(point3D);

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        doPrint(p1);
        doPrint(p2);
        doPrint(p3);

    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

    public static void doPrint(Point point) {
        System.out.println(point.toString());
    }
}
