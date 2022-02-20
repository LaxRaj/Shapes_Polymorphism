//Assignment = HomeWork 03
//File Name - 922119988_HW03
//Name- Lakshyaraj Singh Bhati

public class Circle extends Shape{
    private double radius;
    public Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI ;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

