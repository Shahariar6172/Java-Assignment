public class Circle {
private double radius;
public Circle() {
  radius = 0.0;
  }
    public Circle(double radius) {
    this.radius = radius;
    }
    public void setRadius(double rad) {
      this.radius = rad;
    }
    public double getRadius() {
      return this.radius;
    }
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
