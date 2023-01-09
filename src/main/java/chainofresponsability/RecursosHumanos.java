package chainofresponsability;

public class RecursosHumanos extends Setor{
	@SuppressWarnings("unchecked")
	public RecursosHumanos(Setor proximo) {
        listaOperacoes.add(Admissao.getAdmissao());
        setProximoSetor(proximo);
    }
    
    public String getDescricaoSetor() {
        return "Recursos Humanos";
    }
}
