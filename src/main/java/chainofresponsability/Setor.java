package chainofresponsability;

import java.util.ArrayList;

public abstract class Setor {
	 	protected ArrayList<TipoOperacao> listaOperacoes = new ArrayList<TipoOperacao>();
	    private Setor proximoSetor;

	    public Setor getProximoSetor() {
	        return proximoSetor;
	    }

	    public void setProximoSetor(Setor setor) {
	        this.proximoSetor = setor;
	    }
	    
	    public abstract String getDescricaoSetor();
	    
	    public String aprovarOperacao(Operacao operacao) {
	        if (listaOperacoes.contains(operacao.getTipoOperacao())) {
	            return getDescricaoSetor();
	        }
	        else {
	            if (proximoSetor != null) {
	                return proximoSetor.aprovarOperacao(operacao);
	            }
	            else 
	            {
	                return "Sem Aprovação.";
	            }
	        }        
	    }
}
