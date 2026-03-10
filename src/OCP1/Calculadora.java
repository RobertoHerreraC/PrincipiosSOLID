package OCP1;

public class Calculadora {
    public double calcular(Operacion operacion, double a, double b) {
        return operacion.ejecutar(a, b);
    }
}
