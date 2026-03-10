package OCP2;

public class DescuentoPremium implements DescuentoStrategy{
    @Override
    public double calcular(double total) {
        return total * 0.20;
    }
}
