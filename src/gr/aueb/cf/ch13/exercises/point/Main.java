package gr.aueb.cf.ch13.exercises.point;

public class Main {
    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(10,12,32);

        System.out.println("Point: " + point.convertToString());

        System.out.println("XY Distance: " + point.getXYDistance());
        System.out.println("YZ Distance: " + point.getYZDistance());
        System.out.println("XZ Distance: " + point.getXZDistance());
        System.out.println("XYZ Distance: " + point.getXYZDistance());
    }




}
