package LSP2;

public class Coche extends Vehiculo {
    @Override
    void acelerar(int incremento){
        System.out.println("Eñ coche acelera");
        super.acelerar(incremento);
    }

}
