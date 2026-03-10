package ISP1;

public class ImpresoraEconomica implements Impresora {
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo el blanco y negro: "+documento);
    }
}
