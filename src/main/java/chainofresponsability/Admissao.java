package chainofresponsability;

public class Admissao implements TipoOperacao{
	private static Admissao admissao = new Admissao();

    private Admissao() {};
    
    public static Admissao getAdmissao() {
        return admissao;
    }
}
