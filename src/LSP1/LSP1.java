package LSP1;

public class LSP1 {
    static void ejecutarMovimiento(Ave ave){
        ave.mover();
    }

    static void main() {
        Ave gorrion = new Gorrion();
        Ave pinguino = new Pinguino();

        ejecutarMovimiento(gorrion);
        ejecutarMovimiento(pinguino);
    }
}
