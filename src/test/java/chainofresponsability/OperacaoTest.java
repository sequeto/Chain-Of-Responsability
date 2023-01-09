package chainofresponsability;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacaoTest {
	
	Administrativo administrativo;
    Financeiro financeiro;
    RecursosHumanos recursosHumanos;

    @Before
    public void setUp() {
    	administrativo = new Administrativo(null);
    	financeiro = new Financeiro(administrativo);
    	recursosHumanos = new RecursosHumanos(financeiro);
    }

    @Test
    public void deveRetornarAdministrativoParaAprovacaoDeDemissao() {
        assertEquals("Administrativo", recursosHumanos.aprovarOperacao(new Operacao(Demissao.getDemissao())));
    }

    @Test
    public void deveRetornarRecursosHumanosParaAprovacaoAdmissao() {
        assertEquals("Recursos Humanos", recursosHumanos.aprovarOperacao(new Operacao(Admissao.getAdmissao())));
    }

    @Test
    public void deveRetornarFinanceiroParaAprovacaoCompras() {
    	assertEquals("Financeiro", recursosHumanos.aprovarOperacao(new Operacao(Compras.getCompras())));
    }

    @Test
    public void deveRetornarSemAAprovacaoParaLiberacaoDeFerias() {
        assertEquals("Sem Aprovação.", recursosHumanos.aprovarOperacao(new Operacao(LiberacaoFerias.getLiberacao())));
    }

}
