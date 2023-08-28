package pt.upskill.myshapes;

public class MySquare extends MyRectangle{
  /**
   *
   * @param name Nome do quadrado
   * @param x Componente X da posição (X,y)
   * @param y Componente Y da posição (x,Y)
   * @param size Dimensão de cada lado do quadrado
   */
  public MySquare(String name, double x, double y, double size) {
    super(name, x, y, size, size);
  }

  /**
   * Inicializa o objeto na posição (0,0)
   * @param name Nome do quadrado
   * @param size Dimensão de cada lado do quadrado
   */
  public MySquare(String name, double size) {
    super(name, size, size);
  }

  /**
   * Um quadrado é considerado perfeito se o valor da sua hipotenusa for um número inteiro com um erro máximo de 0.00000001.
   * @return boolean
   */
  @Override
  public boolean isPerfect() {
    double hypotenuse = getHypotenuse();
    return Math.abs(hypotenuse - Math.round(hypotenuse))<=0.00000001;
  }

  /**
   *
   * @return String com a descrição textual dos atributos do objeto
   */
  @Override
  public String toString() {
    return "MySquare{" +
      "name='" + name + '\'' +
      ", x=" + x +
      ", y=" + y +
      ", size=" + width +
      ", perimeter=" + String.format("%.2f", getPerimeter()) +
      ", area=" + String.format("%.2f",getArea()) +
      ", hypotenuse=" + String.format("%.8f",getHypotenuse()) +
      ", isPerfect=" + (isPerfect() ? "YES" : "NO") +
      '}';
  }
}
