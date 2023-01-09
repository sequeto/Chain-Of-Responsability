package chainofresponsability;

public class Demissao implements TipoOperacao{
	private static Demissao demissao = new Demissao();

    private Demissao() {};
    
    public static Demissao getDemissao() {
        return demissao;
    }
}
