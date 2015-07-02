package br.fatec.integracao;

import static org.junit.Assert.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;




import br.fatec.dominio.Empresa;
import br.fatec.persistencia.EmpresaDAO;

public class UC01CadastrarEmpresa {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Session session = Mockito.mock(Session.class);
		Query query = Mockito.mock(Query.class);
		EmpresaDAO empresaDAO = new EmpresaDAO(session);
		Empresa empresa = new Empresa();
		String sql = "from Empresa e where e.nome =:nome and x.email =:email";
		Mockito.when(session.createQuery(sql)).thenReturn(query);
		Mockito.when(query.uniqueResult()).thenReturn(query);
		Mockito.when(query.setParameter("nome","Nova Empresa de Estagio")).thenReturn(query);
		Mockito.when(query.setParameter("email", "empresa1@gmail.com"));
	}
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
