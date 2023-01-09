package chainofresponsability;

public class Compras implements TipoOperacao{
	private static Compras compras = new Compras();

    private Compras() {};
    
    public static Compras getCompras() {
        return compras;
    }
}
