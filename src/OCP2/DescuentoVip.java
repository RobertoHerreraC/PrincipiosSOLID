package OCP2;

import OCP1.Operacion;

public class DescuentoVip implements DescuentoStrategy{
    @Override
    public double calcular(double total) {
        return total * 0.10;
    }
}
