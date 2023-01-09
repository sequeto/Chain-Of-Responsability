package chainofresponsability;

public class Administrativo extends Setor{
	public Administrativo(Setor proximo) {
        listaOperacoes.add(Demissao.getDemissao());
        setProximoSetor(proximo);
    }
    
    public String getDescricaoSetor() {
        return "Administrativo";
    }
}
