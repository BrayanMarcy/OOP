public class Main {
  float x, y, r;
  public Main(float a, float b, float c) {
    x = a;
    y = b;
    r = c;
  }
  public float sumar(float a, float b) {
    x = a;
    y = b;
    r = x + y;
    return r;
  }
  public float restar(float a, float b) {
    x = a;
    y = b;
    r = x - y;
    return r;
  }
  public float multiplicar(float a, float b) {
    x = a;
    y = b;
    r = x * y;
    return r;
  }
  public float dividir(float a, float b) {
    x = a;
    y = b;
    r = x / y;
    return r;
  }
  public float potenciar(float a) {
    x = a;
    r = x * x;
    return r;
  }
  public void imprimirResultado() {
    System.out.println("El resultado es: " + r);
  }
  public static void main(String[] args) {
    Main obj1 = new Main(0,0,0);
    obj1.sumar(26, 5);
    obj1.imprimirResultado();
    obj1.restar(26, 5);
    obj1.imprimirResultado();
    obj1.multiplicar(26, 5);
    obj1.imprimirResultado();
    obj1.dividir(26, 5);
    obj1.imprimirResultado();
    obj1.potenciar(26);
    obj1.imprimirResultado();
  }
}
