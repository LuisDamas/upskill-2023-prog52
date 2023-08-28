package pt.upskill.myshapes;

public class MyRectangle implements Shapable{
  protected double x, y, width, height;
  protected String name;

  public MyRectangle(String name, double x, double y, double width, double height)  throws InvalidSizeException, IllegalArgumentException{
    if (name==null || name.trim()=="")
      throw new IllegalArgumentException();
    this.name = name.toUpperCase();

    this.x = x;
    this.y = y;

    if (width<=0)
      throw new InvalidSizeException();
    this.width = width;

    if (height<=0)
      throw new InvalidSizeException();
    this.height = height;
  }

  public MyRectangle(String name, double width, double height) {
    this(name, 0,0,width, height);
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    if (width<=0)
      throw new InvalidSizeException();
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height<=0)
      throw new InvalidSizeException();
    this.height = height;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name==null || name.trim()=="")
      throw new IllegalArgumentException();
    this.name = name;
  }

  /**
   *
   * @return (double) Área do rectângulo
   */
  @Override
  public double getArea() {
    return width*height;
  }

  /**
   *
   * @return (double) Perímetro do rectângulo
   */
  @Override
  public double getPerimeter() {
    return 2*(width+height);
  }

  /**
   * Cálculo da hipotenúsa de um triângulo rectângulo
   * @return (double) sqrt(w^2+h^2)
   */
  @Override
  public double getHypotenuse() {
    return Math.sqrt(Math.pow(width,2.0)+Math.pow(height, 2.0));
  }

  /**
   * Um retângulo é considerado perfeito se o comprimento do lado menor for
   * superior ou igual a metade do comprimento do lado maior.
   * @return boolean
   */
  @Override
  public boolean isPerfect() {
    double minor = Math.min(width, height);
    double major = Math.max(width, height);
    return minor >= (major/2);
  }

  /**
   *
   * @return String com a descrição textual dos atributos do objeto
   */
  @Override
  public String toString() {
    return "MyRectangle{" +
      "name='" + name + '\'' +
      ", x=" + x +
      ", y=" + y +
      ", width=" + width +
      ", height=" + height +
      ", perimeter=" + String.format("%.2f", getPerimeter()) +
      ", area=" + String.format("%.2f",getArea()) +
      ", hypotenuse=" + String.format("%.8f",getHypotenuse()) +
      ", isPerfect=" + (isPerfect() ? "YES" : "NO") +
      '}';
  }
}
