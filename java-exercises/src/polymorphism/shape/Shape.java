package polymorphism.shape;

public abstract class Shape {
  private double area;
  private String name;

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  Shape(){}

  Shape(String name){
    this.name=name;
  }

  abstract void calculationArea();

  void print() {
    System.out.println(name + "의 면적은 " + area);
  }
}
