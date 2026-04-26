package polymorphism.shape;

public class Rectangular extends Shape {
  private double width;
  private String height;

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  Rectangular(String name, double width, String height) {
    super(name);
    this.width = width;
    this.height = height;
  }

  @Override
  void calculationArea() {
    setArea(width * Double.parseDouble(height));
  }
}
