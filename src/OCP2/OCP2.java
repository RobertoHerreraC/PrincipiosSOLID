package OCP2;

import java.awt.*;

public class OCP2 {
    static void main() {
        DescuentoStrategy descuento = new DescuentoPremium();
        descuento.calcular(10);
    }
}
