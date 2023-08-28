package pt.upskill.myshapes;

public class MySquare extends MyRectangle{
  /**
   *
   * @param name Nome do quadrado
   * @param x Componente X da posi��o (X,y)
   * @param y Componente Y da posi��o (x,Y)
   * @param size Dimens�o de cada lado do quadrado
   */
  public MySquare(String name, double x, double y, double size) {
    super(name, x, y, size, size);
  }

  /**
   * Inicializa o objeto na posi��o (0,0)
   * @param name Nome do quadrado
   * @param size Dimens�o de cada lado do quadrado
   */
  public MySquare(String name, double size) {
    super(name, size, size);
  }

  /**
   * Um quadrado � considerado perfeito se o valor da sua hipotenusa for um n�mero inteiro com um erro m�ximo de 0.00000001.
   * @return boolean
   */
  @Override
  public boolean isPerfect() {
    double hypotenuse = getHypotenuse();
    return Math.abs(hypotenuse - Math.round(hypotenuse))<=0.00000001;
  }

  /**
   *
   * @return String com a descri��o textual dos atributos do objeto
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
