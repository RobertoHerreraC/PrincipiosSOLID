package OCP2;

public class CalculadoraDescuento {
    public double calcular(double total, DescuentoStrategy estrategia){
        return estrategia.calcular(total);
    }
}
