package chainofresponsability;

public class Financeiro extends Setor{
	@SuppressWarnings("unchecked")
	public Financeiro(Setor proximo) {
        listaOperacoes.add(Compras.getCompras());
        setProximoSetor(proximo);
    }
    
    public String getDescricaoSetor() {
        return "Financeiro";
    }
}
