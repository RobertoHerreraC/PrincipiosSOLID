package LSP2;

public class LSP2 {
    static void realizarPruebas(Vehiculo v){
        v.acelerar(20);
        v.frenar(10);
    }

    static void main() {
        Vehiculo micoche = new Coche();
        Vehiculo mibicicleta = new Bicicleta();
        realizarPruebas(micoche);
        realizarPruebas(mibicicleta);

    }
}
