package chainofresponsability;

public class LiberacaoFerias implements TipoOperacao{
	private static LiberacaoFerias liberacao = new LiberacaoFerias();

    private LiberacaoFerias() {};
    
    public static LiberacaoFerias getLiberacao() {
        return liberacao;
    }
}
