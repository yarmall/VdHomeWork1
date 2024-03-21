package vd.lesson1;

public class Main {

    public static void main (String[] args) {

        System.out.println("Hellow World!");

        squareArea();

        circleArea();

        triangleArea();

    }
    public static void squareArea() {

        double side = 4.5;
        double area = (side * side);

        System.out.println("Площадь квадрата равна " + area);

    }

    public static void circleArea() {

        double radius = 5;
        double pi = 3.14;
        double area = pi * (radius * radius);

        System.out.println("Площадь круга равна " + area);

    }

    public static void triangleArea() {

        double h = 12;
        double side = 10.25;
        double area = (h * side) / 2;

        System.out.println("Площадь треугольника равна " + area);

    }

}
